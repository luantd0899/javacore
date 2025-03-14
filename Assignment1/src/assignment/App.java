/**
 * 
 */
package assignment;

import java.time.LocalDate;
import java.util.Date;

import javax.activity.ActivityCompletedException;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		
		//Create department
		Department department = new Department();
		department.departmentId = 1;
		department.departmentName = "Sale";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketting";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "HR";
		
		
		// Create Position
		Position position = new Position();
		position.positionId = 1;
		position.positionName = "Dev";
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = "Tester";
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = "Scrum Master";
		
		
		// Create Account
		Account account = new Account();
		account.accouintId = 1;
		account.email = "luantd@gmail.com";
		account.username = "luantd";
		account.fullName = "Tran Duc Luan";
		account.departmentId = department;
		account.positionId = position;
		account.createDate = LocalDate.now();
		
		
		
		Account account2 = new Account();
		account2.accouintId = 2;
		account2.email = "uyenhtt@gmail.com";
		account2.username = "uyenhtt";
		account2.fullName = "Ha Thi Thu Uyen";
		account2.departmentId = department2;
		account2.positionId = position2;
		account2.createDate = LocalDate.now();
		
		Account account3 = new Account();
		account3.accouintId = 3;
		account3.email = "tungtv@gmail.com";
		account3.username = "tungtv";
		account3.fullName = "Tran Van Tung";
		account3.departmentId = department3;
		account3.positionId = position3;
		account3.createDate = LocalDate.now();
		
		
		Account[] accounts = {account, account2, account3};
		//Create Group
		
		Group group = new Group();
		group.groupId = 1;
		group.groupName = "Group 1";
		group.creatorId = 1;
		group.createDate = LocalDate.now();
		
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "Group 2";
		group2.creatorId = 2;
		group2.createDate = LocalDate.now();
		
		
		
		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "Group 3";
		group3.creatorId = 3;
		group3.createDate = LocalDate.now();
		
		
		//Create GroupAccount
		GroupAccount groupAccount = new GroupAccount();
		groupAccount.groupId = group;
		groupAccount.accountId = account;
		groupAccount.joinDate = LocalDate.now();
		
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.groupId = group2;
		groupAccount2.accountId = account2;
		groupAccount2.joinDate = LocalDate.now();
		
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.groupId = group3;
		groupAccount3.accountId = account3;
		groupAccount3.joinDate = LocalDate.now();
		
		
		//Create TypeQuestion
		TypeQuestion typeQuestion = new TypeQuestion();
		typeQuestion.typeId = 1;
		typeQuestion.typeName = "Essay";
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = "Multiple-Choice";
		
		
		//Create CategoryQuestion
		CategoryQuestion categoryQuestion = new CategoryQuestion();
		categoryQuestion.categoryId = 1;
		categoryQuestion.categoryName = "Java";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "C#";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "PHP";
		
		
		
		//Create Question
		Question question = new Question();
		question.questionId = 1;
		question.content = "Java la gi?";
		question.categoryId = categoryQuestion;
		question.typeId = typeQuestion;
		question.creatorId = 1;
		question.createDate = LocalDate.now();
		
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "Java co phai la ngon ngu lap trinh khong?";
		question2.categoryId = categoryQuestion;
		question2.typeId = typeQuestion2;
		question2.creatorId = 1;
		question2.createDate = LocalDate.now();
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "C# la gi?";
		question3.categoryId = categoryQuestion2;
		question3.typeId = typeQuestion;
		question3.creatorId = 2;
		question3.createDate = LocalDate.now();
		
		Question question4 = new Question();
		question4.questionId = 4;
		question4.content = "C# la mot bo phim dung khong";
		question4.categoryId = categoryQuestion2;
		question4.typeId = typeQuestion2;
		question4.creatorId = 2;
		question4.createDate = LocalDate.now();
		
		Question question5 = new Question();
		question5.questionId = 5;
		question5.content = "PHP la gi?";
		question5.categoryId = categoryQuestion3;
		question5.typeId = typeQuestion;
		question5.creatorId = 3;
		question5.createDate = LocalDate.now();
		
		
		Question question6 = new Question();
		question6.questionId = 5;
		question6.content = "PHP co phai la mon an khong?";
		question6.categoryId = categoryQuestion3;
		question6.typeId = typeQuestion2;
		question6.creatorId = 3;
		question6.createDate = LocalDate.now();
		
		//Create Answer
		Answer answer = new Answer();
		answer.answerId = 1;
		answer.content = "Khong biet";
		answer.questionId = question;
		answer.isCorrect = "False";
		
		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "Co";
		answer2.questionId = question2;
		answer2.isCorrect = "True";
		
		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = "Khong";
		answer3.questionId = question2;
		answer3.isCorrect = "False";
		
		Answer answer4 = new Answer();
		answer4.answerId = 4;
		answer4.content = "C# la ngon ngu lap trinh huong doi tuong.";
		answer4.questionId = question3;
		answer4.isCorrect = "True";
		
		Answer answer5 = new Answer();
		answer5.answerId = 5;
		answer5.content = "Sai. C# la ngon ngu lap trinh";
		answer5.questionId = question4;
		answer5.isCorrect = "True";
		
		Answer answer6 = new Answer();
		answer6.answerId = 5;
		answer6.content = "Dung. C# la mot bo phim hanh dong";
		answer6.questionId = question4;
		answer6.isCorrect = "False";
		
		Answer answer7 = new Answer();
		answer7.answerId = 7;
		answer7.content = "PHP la mot mon an";
		answer7.questionId = question5;
		answer7.isCorrect = "False";
		
		
		Answer answer8 = new Answer();
		answer8.answerId = 8;
		answer8.content = "No, PHP la ngon ngu lap trinh";
		answer8.questionId = question6;
		answer8.isCorrect = "True";
		
		Answer answer9 = new Answer();
		answer9.answerId = 9;
		answer9.content = "No, PHP la mot mon the thao";
		answer9.questionId = question6;
		answer9.isCorrect = "False";
		
		//Create Exam
		Exam exam = new Exam();
		exam.examId = 1;
		exam.code = 001;
		exam.title = "Bai kiem tra Java";
		exam.categoryId = categoryQuestion;
		exam.duration = 90;
		exam.creatorId = 1;
		exam.createDate  = new Date();
		
		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = 002;
		exam2.title = "Bai kiem tra C#";
		exam2.categoryId = categoryQuestion2;
		exam2.duration = 90;
		exam2.creatorId = 1;
		exam2.createDate  = new Date();
		
		
		
		Exam exam3 = new Exam();
		exam3.examId = 3;
		exam3.code = 003;
		exam3.title = "Bai kiem tra PHP";
		exam3.categoryId = categoryQuestion3;
		exam3.duration = 90;
		exam3.creatorId = 1;
		exam3.createDate  = new Date();
		
		
		//Create ExamQuestion
		ExamQuestion examQuestion = new ExamQuestion();
		examQuestion.examId = exam;
		examQuestion.questionId = question;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.examId = exam;
		examQuestion2.questionId = question2;
		
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.examId = exam;
		examQuestion3.questionId = question3;
		
		// question 1
		if (account2.departmentId == null) {
			System.out.println("Nhan vien nay khong co phong ban");
			
		}
		else {
			System.out.println("phong ban cua nhan vien nay la:  " + account2.departmentId.departmentName);
		}
		 
		
		
		// question 2
		
		if (account2.groups == null) {
			System.out.println("Nhan vien nay chua co group");
		}
		else if(account2.groups.length == 1 || account2.groups.length == 2) {
			System.out.println("Nhan vien nay la Fresher");
		}
		else if(account2.groups.length == 3) {
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
		}
		else {
			System.out.println("Nhan vien nay la nguoi hong chuyen");
		}
		
		
		// question 3
		System.out.println(account2.departmentId == null ? "nhan vien nay chua co phong ban" : "phong ban cua nhan vien nay la" + account2.departmentId.departmentName);
		
		
		//question 5
		int a = group.accounts.length;
		
		switch (a) {
		case 0:
			System.out.println("Nhom khong co thanh vien");
			break;
		case 1:
			System.out.println("Nhom co 1 thanh vien");
			break;
			
		case 2: 
			System.out.println("Nhom co 2 thanh vien");
			break;
			
		case 3:
			System.out.println("Nhom co 3 thanh vien");
		break;
		default:
			System.out.println("Nhom co nhieu thanh vien");
			break;
		}
		
		System.out.println("=====Question 10=====");
		
		
		// Question 10
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin cua account thu: " + (i+1));
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Username: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].departmentId.departmentId);
			System.out.println("Position: " + accounts[i].positionId.positionId);
			System.out.println("Create Date: " + accounts[i].createDate);
		}
		
		// Question 11
		Department[] departments = {department, department2, department3};
		for(int i =0 ; i< departments.length; i++)
		{
			System.out.println("Thông tin phòng ban thứ: " + (i+1));
			System.out.println("ID: " + departments[i].departmentId);
			System.out.println("Name: " + departments[i].departmentName);
		}
		
		//Question12
		for(int i =0 ; i< departments.length; i++)
		{
			System.out.println("Thông tin phòng ban thứ: " + (i+1));
			System.out.println("ID: " + departments[i].departmentId);
			System.out.println("Name: " + departments[i].departmentName);
			if (i ==3) {
				break;
			}
		}
		
		//Question 13
		for (int i = 0; i < accounts.length; i++)
		{
			System.out.println("Thong tin cua account thu: " + (i+1));
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Username: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].departmentId.departmentId);
			System.out.println("Position: " + accounts[i].positionId.positionId);
			System.out.println("Create Date: " + accounts[i].createDate);
			if (i ==2) {
				continue;
			}
		}
		
		// Question 14
		
		for (int i = 0; i < accounts.length; i++)
		{
			System.out.println("Thong tin cua account thu: " + (i+1));
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Username: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].departmentId.departmentId);
			System.out.println("Position: " + accounts[i].positionId.positionId);
			System.out.println("Create Date: " + accounts[i].createDate);
			if (i ==4) {
				break;
			}
		}
		
		// Question 15
		System.out.println("Các số chẵn <=20");
		for (int i = 1; i <=20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		//Question 16
		// Làm lại Question 14 = while
		int i =0;
		while(true)
		{
			System.out.println("Thong tin cua account thu: " + (i+1));
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Username: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].departmentId.departmentId);
			System.out.println("Position: " + accounts[i].positionId.positionId);
			System.out.println("Create Date: " + accounts[i].createDate);
			i++;
			if (i ==4) {
				break;
			}
		}
		
		// Question 17 - Làm lại Question 14 = do while
		do {
			System.out.println("Thong tin cua account thu: " + (i+1));
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Name: " + accounts[i].fullName);
			System.out.println("Username: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].departmentId.departmentId);
			System.out.println("Position: " + accounts[i].positionId.positionId);
			System.out.println("Create Date: " + accounts[i].createDate);
			i++;
			if (i ==4) {
				break;
			}
		} while (true);
		
		// Question 6 , 7
		int b = account2.groups.length;
		switch (b)
		{
			case 0:
				System.out.println("Nhân viên này chưa có group");
				break;
			
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher");
				break;
				
			case 2:
				System.out.println("Group của nhân viên này là C# Fresher");
				break;
				
			case 3:
				System.out.println("Nhân viên này là người quuan trọng, tham gia nhiều group");
				break;
				
			case 4:
				System.out.println("Nhân viên này tham gia tất cả các group");
				break;
				
			default:
				System.out.println("none");
				break;
		}
		
		
	}
}
