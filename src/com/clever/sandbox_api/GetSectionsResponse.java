/**
 * 
 */
package com.clever.sandbox_api;

import com.clever.sandbox_api.GetSectionsResponse.Data.Data1;

/**
 * @author Arun
 *
 */
public final class GetSectionsResponse {
    public final Data data[];
    public final Paging paging;
    public final Link links[];

    public GetSectionsResponse(Data[] data, Paging paging, Link[] links){
        this.data = data;
        this.paging = paging;
        this.links = links;
    }

    public static final class Data {
        public final Data1 data;
        public final String uri;

        public Data(Data1 data, String uri){
            this.data = data;
            this.uri = uri;
        }
       
        public static final class Data1 {
            public final String course_name;
            public final String course_number;
            public final String created;
            public final String district;
            public final String grade;
            public final String last_modified;
            public final String name;
            public final String period;
            public final String school;
            public final String sis_id;
            public final String[] students;
            public final String subject;
            public final String teacher;
            public final String[] teachers;
            public final Term term;
            public final String id;
    
            public Data1(String course_name, String course_number, String created, String district, String grade, String last_modified, String name, String period, String school, String sis_id, String[] students, String subject, String teacher, String[] teachers, Term term, String id){
                this.course_name = course_name;
                this.course_number = course_number;
                this.created = created;
                this.district = district;
                this.grade = grade;
                this.last_modified = last_modified;
                this.name = name;
                this.period = period;
                this.school = school;
                this.sis_id = sis_id;
                this.students = students;
                this.subject = subject;
                this.teacher = teacher;
                this.teachers = teachers;
                this.term = term;
                this.id = id;
            }
    
            public static final class Term {
                public final String end_date;
                public final String name;
                public final String start_date;
        
                public Term(String end_date, String name, String start_date){
                    this.end_date = end_date;
                    this.name = name;
                    this.start_date = start_date;
                }
            }
        }
    }

    public static final class Paging {
        public final long current;
        public final long total;
        public final long count;

        public Paging(long current, long total, long count){
            this.current = current;
            this.total = total;
            this.count = count;
        }
    }

    public static final class Link {
        public final String rel;
        public final String uri;

        public Link(String rel, String uri){
            this.rel = rel;
            this.uri = uri;
        }
    }
}