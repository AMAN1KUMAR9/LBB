/*
package com.legalbriz.legalBriz.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legalbriz.legalBriz.dao.Dao;
import com.legalbriz.legalBriz.model.Lawyer;


@RestController
public class Controller {
    @Autowired
    private Dao dao;

    @GetMapping("/hey")
    public List<Lawyer> name (){
        return dao.findAll();
    }
}
*/

package com.legalbriz.legalBriz.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legalbriz.legalBriz.model.Lawyer;

@RestController
public class Controller {

    @GetMapping("/hey")
    public List<Lawyer> name() {
        return Arrays.asList(
                new Lawyer(1L, "Mon–Fri | 10:00 AM – 5:00 PM", "Expert in criminal law, handling sensitive and high-profile cases.", "10+ Years", "₹1000", "English, Hindi", "Delhi High Court, India", "Adv. Radhika Mehra", 4.5, "Criminal Lawyer"),
                new Lawyer(2L, "Mon–Sat | 9:00 AM – 6:00 PM", "Worked with Fortune 500 firms on corporate restructuring.", "8 Years", "₹1500", "English, Hindi, Marathi", "Mumbai High Court, India", "Adv. Aman Kumar", 4.8, "Corporate Lawyer"),
                new Lawyer(3L, "Tue–Sat | 11:00 AM – 4:00 PM", "Renowned for defending civil rights and liberties.", "7 Years", "₹1200", "English, Bengali", "Kolkata High Court, India", "Adv. Sanya Roy", 4.6, "Civil Rights Lawyer"),
                new Lawyer(4L, "Mon–Thu | 10:00 AM – 4:00 PM", "Known for winning complex intellectual property cases.", "9 Years", "₹1800", "English, Tamil", "Chennai High Court, India", "Adv. Arjun Iyer", 4.9, "IP Lawyer"),
                new Lawyer(5L, "Mon–Sat | 8:00 AM – 1:00 PM", "Specialist in property disputes and settlements.", "6 Years", "₹900", "Hindi, Punjabi", "Punjab & Haryana HC, India", "Adv. Meera Kaur", 4.4, "Property Lawyer"),
                new Lawyer(6L, "Mon–Fri | 9:00 AM – 3:00 PM", "Known for success in family law matters.", "11 Years", "₹1100", "English, Hindi", "Lucknow Bench, India", "Adv. Neha Sharma", 4.7, "Family Lawyer"),
                new Lawyer(7L, "Mon–Fri | 10:00 AM – 5:00 PM", "Handles national and international business cases.", "13 Years", "₹2000", "English, Gujarati", "Ahmedabad HC, India", "Adv. Ritesh Patel", 4.9, "Corporate Lawyer"),
                new Lawyer(8L, "Mon–Fri | 10:00 AM – 5:00 PM", "Expert in criminal investigations and trials.", "12 Years", "₹1400", "English, Hindi", "Delhi High Court, India", "Adv. Karan Mehta", 4.3, "Criminal Lawyer"),
                new Lawyer(9L, "Mon–Sat | 11:00 AM – 6:00 PM", "Counsel for environment-related litigations.", "5 Years", "₹1000", "English, Malayalam", "Kerala HC, India", "Adv. Divya Nair", 4.2, "Environmental Lawyer"),
                new Lawyer(10L, "Tue–Sat | 12:00 PM – 5:00 PM", "Advocate for child welfare and custody cases.", "6 Years", "₹950", "English, Hindi", "Patna HC, India", "Adv. Ritu Kumari", 4.5, "Family Lawyer"),
                new Lawyer(11L, "Mon–Fri | 10:00 AM – 6:00 PM", "Advises tech startups on legal frameworks.", "4 Years", "₹1300", "English", "Bangalore HC, India", "Adv. Pranav Rao", 4.6, "Tech Lawyer"),
                new Lawyer(12L, "Mon–Fri | 9:00 AM – 2:00 PM", "Helped resolve over 200 divorce cases.", "10 Years", "₹850", "Hindi, English", "Jaipur HC, India", "Adv. Sunita Joshi", 4.4, "Family Lawyer"),
                new Lawyer(13L, "Mon–Sat | 10:00 AM – 5:00 PM", "Guides clients through mergers and acquisitions.", "9 Years", "₹1600", "English, Hindi", "Mumbai HC, India", "Adv. Ankur Bansal", 4.7, "Corporate Lawyer"),
                new Lawyer(14L, "Mon–Fri | 9:00 AM – 1:00 PM", "Protects intellectual property for inventors.", "5 Years", "₹1000", "English", "Hyderabad HC, India", "Adv. Sneha Reddy", 4.5, "IP Lawyer"),
                new Lawyer(15L, "Mon–Fri | 10:00 AM – 6:00 PM", "Has handled international arbitration cases.", "15 Years", "₹2500", "English, Urdu", "Delhi High Court, India", "Adv. Faisal Khan", 4.8, "International Lawyer"),
                new Lawyer(16L, "Mon–Sat | 8:00 AM – 12:00 PM", "Handles accident and injury claims.", "7 Years", "₹800", "Hindi", "Bhopal HC, India", "Adv. Deepika Jain", 4.3, "Personal Injury Lawyer"),
                new Lawyer(17L, "Mon–Fri | 10:00 AM – 4:00 PM", "Advocates on workplace rights and discrimination.", "6 Years", "₹1100", "English, Hindi", "Chandigarh HC, India", "Adv. Arti Verma", 4.6, "Employment Lawyer"),
                new Lawyer(18L, "Mon–Sat | 10:00 AM – 5:00 PM", "Known for successful bail applications.", "8 Years", "₹1300", "Hindi, English", "Delhi High Court, India", "Adv. Mohit Sharma", 4.4, "Criminal Lawyer"),
                new Lawyer(19L, "Mon–Fri | 9:00 AM – 2:00 PM", "Assists with immigration and visa issues.", "10 Years", "₹1200", "English, Punjabi", "Amritsar, India", "Adv. Harleen Kaur", 4.5, "Immigration Lawyer"),
                new Lawyer(20L, "Mon–Fri | 11:00 AM – 6:00 PM", "Represented cases in consumer courts across India.", "9 Years", "₹900", "English, Hindi", "Nagpur HC, India", "Adv. Rajeev Tiwari", 4.4, "Consumer Lawyer"),
                new Lawyer(21L, "Mon–Fri | 9:00 AM – 5:00 PM", "Advised NGOs and non-profits on legal matters.", "6 Years", "₹1000", "English, Marathi", "Pune, India", "Adv. Saurabh Kulkarni", 4.2, "Nonprofit Lawyer"),
                new Lawyer(22L, "Mon–Sat | 10:00 AM – 5:00 PM", "Fights for equal rights and social justice.", "7 Years", "₹1150", "Hindi, Bengali", "Kolkata HC, India", "Adv. Tarun Sen", 4.3, "Human Rights Lawyer"),
                new Lawyer(23L, "Mon–Fri | 8:00 AM – 1:00 PM", "Known for dispute resolution in real estate.", "9 Years", "₹1700", "English, Hindi", "Noida Court, India", "Adv. Aarti Chhabra", 4.5, "Property Lawyer"),
                new Lawyer(24L, "Mon–Sat | 9:00 AM – 4:00 PM", "Experienced in cross-border commercial litigation.", "14 Years", "₹2400", "English", "Delhi High Court, India", "Adv. Raghav Bhatnagar", 4.9, "Corporate Lawyer"),
                new Lawyer(25L, "Mon–Fri | 10:00 AM – 6:00 PM", "Expert in handling cybercrime and data privacy.", "8 Years", "₹1350", "English, Kannada", "Bangalore, India", "Adv. Lakshmi Rao", 4.7, "Cyber Lawyer")
        );
    }
}
