package com.example.demo;

import javax.persistence.*;
@Entity
public class User {
		@Id
		String name;
		String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", password=" + password + "]";
		}
		
}
