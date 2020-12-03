package zpf;


class Student {
	String name;							//学生姓名
	String number;							//学生学号
	String sex;							    //学生性别
	String age;								//年龄
	String banji;							//学生班级
	Student(){			//构造无参函数
		
	}
	Student(String name,String number,String sex,String age,String banji){		//构造有参函数
		this.name=name;
		this.number=number;
		this.sex=sex;
		this.age=age;
		this.banji=banji;	
	}
	public String getName() {     //获取
		return name;
	}
	public void setName(String name) {   //创建
		this.name=name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public String getSex() {
		return sex;
	}
	public void setSexy(String sex) {
		this.sex=sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji=banji;
	}

	public String toString() {				//重写toString()方法
		String information="\n"+"姓名："+name+"\n"+"学号："+number+"\n"+"性别："+sex+"\n"+"年龄："+age+"\n"+"班级："+banji+"\n";
		return information;
	}
	
	
}
