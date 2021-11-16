package com.platzi.hibernate.model;

import java.io.Serializable;

public class Course implements Serializable{
	
	private Long idCourse;
	private String themes;
	private String project;
	private Teacher teacher;
	
	public Long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String themes, String project, Teacher teacher) {
		super();
		this.themes = themes;
		this.project = project;
		this.teacher = teacher;
	}
	
	

}
