package com;

public class Manager {
		void dis() {
			System.out.println("dis method");
		}
		@Override
		protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before GC");
		}
}
