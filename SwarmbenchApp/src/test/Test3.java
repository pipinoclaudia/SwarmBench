//package test;
//
//
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import beans.CSeqBean;
//import beans.SpinBean;
//import dataWorkers.CSeqJsonWriter;
//import dataWorkers.CSeqReader;
//import dataWorkers.SpinJsonWriter;
//import dataWorkers.SpinReader;
//import factories.CSeqFactory;
//import factories.SpinFactory;
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		try {
//
//			
//			CSeqReader cseqReader = new CSeqReader();
//			SpinReader spinReader = new SpinReader();
//			CSeqFactory cseqFactory = new CSeqFactory();
//			SpinFactory spinFactory = new SpinFactory();
//			
//			
//			String nomeFile= "mutex";
//			
//			ArrayList<String> resCseqReader = cseqReader.readCSeqOut("/Users/claudiapipino/Desktop/esempi/cseq/"+nomeFile+".log", "/Users/claudiapipino/Desktop/esempi/cseq/_cs_"+nomeFile+".c.cbmc.log");
//			ArrayList<String> resSpinReader = spinReader.readSpinOut("/Users/claudiapipino/Desktop/esempi/spin/"+nomeFile+"/script0.out", "/Users/claudiapipino/Desktop/esempi/spin/"+nomeFile+"/script1.out", "/Users/claudiapipino/Desktop/esempi/spin/"+nomeFile+"/"+nomeFile+".txt");
//			
//			CSeqBean cseqBean = cseqFactory.createCSeqBean(resCseqReader);
//			
//			SpinBean spinBean = spinFactory.create_SpinBean(resSpinReader, "mutex");
//			
//			
//			
//			BufferedWriter buff = new BufferedWriter(new FileWriter("/Users/claudiapipino/Desktop/esempi/cseq/result/"+nomeFile+".json",false));
//			CSeqJsonWriter jsonw= new CSeqJsonWriter(buff);
//			String json1 = jsonw.createCSeqJsonWriter(cseqBean);
//			
//			jsonw.createTableJSonCseq(json1);
//			
//			buff.close();
//			
//			
//			BufferedWriter buff2 = new BufferedWriter(new FileWriter("/Users/claudiapipino/Desktop/esempi/spin/result/"+nomeFile+".json",false));
//			SpinJsonWriter jsonw2= new SpinJsonWriter(buff2);
//			String json2 = jsonw2.createSpinJsonWriter(spinBean);
//			
//			jsonw2.createTableJSonSpin(json2);
//			
//			buff2.close();
//
//			
//			System.out.println(cseqBean.toString());
//			System.out.println(spinBean.toString());
//			
//			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//	}
//
//}
