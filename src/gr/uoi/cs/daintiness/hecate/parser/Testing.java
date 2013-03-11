package gr.uoi.cs.daintiness.hecate.parser;

import java.io.File;

public class Testing {

	public Testing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Coppermine/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/DekiWiki/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/e107/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Joomla 1.5/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/NucleusCMS/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/phpwiki/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/SlashCode/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/TikiWiki/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Typo3/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/wikimedia/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/XOOPS/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Zabbix/mysql/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Zabbix/oracle/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CMS\'s/Zabbix/postgresql/schemata" ;

//		String path = "/home/iskoulis/Dev/Evolution Datasets/Med/biosql/schemata" ;
//		String path = "/home/iskoulis/Dev/Evolution Datasets/Med/Ensembl/schemata" ;
		
//		String path = "/home/iskoulis/Dev/Evolution Datasets/CERN/Atlas/schemata" ;
		
		String path = "/home/iskoulis/";
		
		File dir = new File(path);
		
		String[] list = dir.list();
		java.util.Arrays.sort(list);
		
//		for (int i = 0; i < list.length; i++)  {
//			System.out.println(list[i]);
//			HecateParser.parse(path + File.separator + list[i]);
//		}
		
		System.out.println(list[0]);
		HecateParser.parse(path + File.separator + "test");
	}
}
