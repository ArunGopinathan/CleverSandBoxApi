/**
 * 
 */
package com.clever.sandbox_api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
/**
 * @author Arun
 *
 */
import org.apache.http.client.fluent.Request;

import com.clever.sandbox_api.GetSectionsResponse.Data;
import com.clever.sandbox_api.GetSectionsResponse.Data.Data1;
import com.google.gson.Gson;

public class Task {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// get the districts
			String sections_json = Request.Get("https://api.clever.com/v1.1/sections")
					.addHeader("Authorization", "Bearer DEMO_TOKEN").execute().returnContent().asString();
					// System.out.println(body);

			// System.out.println(sections_json);
			Gson gsonObj = new Gson();
			GetSectionsResponse getSectionResponse = gsonObj.fromJson(sections_json, GetSectionsResponse.class);
			int TotalStudents = 0;
			int TotalSections = 0;
			Data[] datas = getSectionResponse.data;
			TotalSections = datas.length;
			for (Data data : datas) {
				TotalStudents += data.data.students.length;
			}
			System.out.println("Total Students = " + TotalStudents);
			System.out.println("Total Sections = " + TotalSections);
			System.out.println("Average Number of Students/Section = " + (float) TotalStudents / TotalSections);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
