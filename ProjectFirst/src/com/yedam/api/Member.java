package com.yedam.api;

public class Member
{
	public String id;

	public Member() // 기본생성자
	{
	}

	public Member(String id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "id값은" + this.id;
//		return super.toString();
	}
	
	@Override
	public int hashCode()
	{
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}//end of class
