
public class Date {
		private int day;
		private int month;
		private int year;
		
		public int getDay() {
			return day;
		}
		
		public int getMonth() {
			return month;
		}


		public int getYear() {
			return year;
		}
		
		
		public void setDate(int day, int month, int year) 
		{
			if (year < 1 || year > 2100)
				this.year = 2000;
			else
				this.year = year;
			
			if (! isMonthValid(month))
				{
				this.month = 1;
				if(! isDayValid(day))
					this.day = 1;
				else
					this.day = day;
				}
			else
				{
					this.month = month;
					if(! isDayValid(day))
						this.day = 1;
					else
						this.day = day;
				}
		}
		
		public boolean isMonthValid(int month) 
		{
			if(month < 1 || month > 12)
				return false;
			return true;
		}
		
		public boolean isDayValid(int day)
		{
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				if(day < 1 || day > 31)
					return false;
				else 
					return true;
			}
			
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(day < 1 || day > 30)
					return false;
				else 
					return true;
			}
			
			else if (month == 2)
			{
				if (isLeap(year))
				{
					if(day < 1 || day > 29)
						return false;
					else 
						return true;
				}
				else
				{
					if(day < 1 || day > 28)
						return false;
					else 
						return true;
				}
			}
			return true;
		}

		
		public void getDate() {
			System.out.print("Date is " + getDay() + "/" + getMonth() + "/" + getYear());
		}
		
		public boolean isLeap(int year)
		{
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
				return true;
			else 
				return false;
		}
		
		public addDays(int daysToAdd)
		{
			
		}
		
		public addMonths(int monthsToAdd)
		{
//			days = logic 
			return addDays(days);
		}
		
		public addYears(int yearsToAdd)
		{
			int months = yearsToAdd * 12;
			return addMonths(months);
		}
}
