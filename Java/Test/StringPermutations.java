class StringPermutations 
{
	public static void main(String[] args) 
	{
		String str1 = "hii hello how are you";
		String str2 = "hello hii how are you";

		if(!(str1.equals(str2))) {
			System.out.println("not permutation to each other");
		}
		else{
			char[] eachChar1 = str1.split('');
			char[] eachChar2 = str2.split('');
			boolean isPermunation = true;
			for (int i = 0;i<eachChar1.length ;i++ )
			{
				char ch1 = eachChar[i];
				boolean found = false;

				for (int j = 0;j<eachChar2.length ;j++ )
				{
					char ch2 = eachChar2[j];
					if (ch1 == ch2)
					{
						eachChar2[j] = '#';
						found = true;
						break;
					}
				}

				if(!(found))
				{
					isPermutaion = false;
					System.out.println("not permutation to each other");
					break;
				}
			}
			if (isPermunation)
			{
				System.out.println("it is permutation");
			}
		}
	}
}
