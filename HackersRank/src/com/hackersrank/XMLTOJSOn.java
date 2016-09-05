package com.hackersrank;

import org.json.XML;

public class XMLTOJSOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xml_text = "<note> <style type='text/css'/> <to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note> ";
		System.out.println(XML.toJSONObject(xml_text).toString());
		
	}

}
