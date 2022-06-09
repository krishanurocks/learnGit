package com.krishanu.JsonExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReadExample {

	public JSONReadExample() throws FileNotFoundException, IOException, ParseException {
		System.out.println("\n This example for JSONExample.json\n********************************************");
		Object obj1 = new JSONParser().parse(new FileReader("JSONExample.json"));
		if (obj1 instanceof JSONObject) {
			JSONObject jo = (JSONObject) obj1;
			Set<String> set = jo.keySet();
			Iterator<String> setItr = set.iterator();
			while (setItr.hasNext()) {
				String key = setItr.next();
				if (jo.get(key) instanceof JSONObject) {
					JSONObject tempJsonObject1 = (JSONObject) jo.get(key);
					Set<String> tempSet1 = tempJsonObject1.keySet();
					Iterator<String> tempSetItr1 = tempSet1.iterator();
					while (tempSetItr1.hasNext()) {
						String key1 = tempSetItr1.next();
						if (tempJsonObject1.get(key1) instanceof JSONObject) {
							JSONObject tempJsonObject2 = (JSONObject) tempJsonObject1.get(key1);
							Set<String> tempSet2 = tempJsonObject2.keySet();
							Iterator<String> tempSetItr2 = tempSet2.iterator();
							while (tempSetItr2.hasNext()) {
								String key2 = tempSetItr2.next();
								if (tempJsonObject2.get(key2) instanceof JSONObject) {
									JSONObject tempJsonObject3 = (JSONObject) tempJsonObject2.get(key2);
									Set<String> tempSet3 = tempJsonObject3.keySet();
									Iterator<String> tempSetItr3 = tempSet3.iterator();
									while (tempSetItr3.hasNext()) {
										String key3 = tempSetItr3.next();
										if (tempJsonObject3.get(key3) instanceof JSONArray) {
											JSONArray tempJsonArray3 = (JSONArray) tempJsonObject3.get(key3);
											for (int i = 0; i < tempJsonArray3.size(); i++) {
												if (tempJsonArray3.get(i) instanceof JSONObject) {
													JSONObject tempJsonObject4 = (JSONObject) tempJsonArray3.get(i);
													Set<String> tempSet4 = tempJsonObject4.keySet();
													Iterator<String> tempSetItr4 = tempSet4.iterator();
													while (tempSetItr4.hasNext()) {
														String key4 = tempSetItr4.next();
														if (tempJsonObject4.get(key4) instanceof JSONObject) {
															JSONObject tempJsonObject5 = (JSONObject) tempJsonObject4
																	.get(key4);
															Set<String> tempSet5 = tempJsonObject5.keySet();
															Iterator<String> tempSetItr5 = tempSet5.iterator();
															while (tempSetItr5.hasNext()) {
																String key5 = tempSetItr5.next();
																String res5 = (tempJsonObject5.get(key5)
																		.toString() == null) ? ""
																				: tempJsonObject5.get(key5).toString();
																System.out.println(key + " :: " + key1 + " :: " + key2
																		+ " :: " + key3 + " :: " + key4 + " :: " + key5
																		+ " :: " + res5);
															}
														} else if (tempJsonObject4.get(key4) instanceof JSONArray) {
															JSONArray tempJsonArray5 = (JSONArray) tempJsonObject4
																	.get(key4);
															for (int ii = 0; ii < tempJsonArray5.size(); ii++) {
																if (tempJsonArray5.get(ii) instanceof JSONObject) {
																	JSONObject tempJsonObject6 = (JSONObject) tempJsonArray5
																			.get(ii);
																	Set<String> tempSet6 = tempJsonObject6.keySet();
																	Iterator<String> tempSetItr6 = tempSet6.iterator();
																	while (tempSetItr6.hasNext()) {
																		String key6 = tempSetItr6.next();
																		if (tempJsonObject6
																				.get(key6) instanceof JSONArray) {
																			JSONArray tempJsonArray7 = (JSONArray) tempJsonObject6
																					.get(key6);
																			for (int ij = 0; ij < tempJsonArray7
																					.size(); ij++) {
																				if (tempJsonArray7.get(
																						ij) instanceof JSONObject) {
																					JSONObject tempJsonObject8 = (JSONObject) tempJsonArray7
																							.get(ij);
																					Set<String> tempSet8 = tempJsonObject8
																							.keySet();
																					Iterator<String> tempSetItr8 = tempSet8
																							.iterator();
																					while (tempSetItr8.hasNext()) {
																						String key8 = tempSetItr8
																								.next();
																						String res8 = (tempJsonObject8
																								.get(key8)
																								.toString() == null)
																										? ""
																										: tempJsonObject8
																												.get(key8)
																												.toString();
																						System.out.println(key + " :: "
																								+ key1 + " :: " + key2
																								+ " :: " + key3 + " :: "
																								+ key4 + " :: " + key6
																								+ " :: " + key8 + " :: "
																								+ res8);
																					}
																				} else {
																					String res7 = (tempJsonArray7
																							.get(ij) == null)
																									? ""
																									: tempJsonArray7
																											.get(ij)
																											.toString();
																					System.out.println(key + " :: "
																							+ key1 + " :: " + key2
																							+ " :: " + key3 + " :: "
																							+ key4 + " :: " + key6
																							+ " :: " + res7);
																				}
																			}
																		} else {
																			String res6 = (tempJsonObject6.get(key6)
																					.toString() == null) ? ""
																							: tempJsonObject6.get(key6)
																									.toString();
																			System.out.println(key + " :: " + key1
																					+ " :: " + key2 + " :: " + key3
																					+ " :: " + key4 + " :: " + key6
																					+ " :: " + res6);
																		}
																	}
																} else {
																	String res5 = (tempJsonArray5.get(ii)
																			.toString() == null) ? ""
																					: tempJsonArray5.get(ii).toString();
																	System.out.println(key + " :: " + key1 + " :: "
																			+ key2 + " :: " + key3 + " :: " + key4
																			+ " :: " + res5);
																}
															}
														} else {
															String res4 = (tempJsonObject4.get(key4).toString() == null)
																	? ""
																	: tempJsonObject4.get(key4).toString();
															System.out.println(key + " :: " + key1 + " :: " + key2
																	+ " :: " + key3 + " :: " + key4 + " :: " + res4);
														}
													}
												} else {
													String res3 = (tempJsonArray3.get(i).toString() == null) ? ""
															: tempJsonArray3.get(i).toString();
													System.out.println(key + " :: " + key1 + " :: " + key2 + " :: "
															+ key3 + " :: " + res3);
												}
											}
										} else {
											String res3 = (tempJsonObject3.get(key3).toString() == null) ? ""
													: tempJsonObject3.get(key3).toString();
											System.out.println(key + " :: " + key1 + " :: " + key2 + " :: " + key3
													+ " :: " + res3);
										}
									}
								} else {
									String res2 = (tempJsonObject2.get(key2).toString() == null) ? ""
											: tempJsonObject2.get(key2).toString();
									System.out.println(key + " :: " + key1 + " :: " + key2 + " :: " + res2);
								}
							}
						} else {
							String res1 = (tempJsonObject1.get(key1).toString() == null) ? ""
									: tempJsonObject1.get(key1).toString();
							System.out.println(key + " :: " + key1 + " :: " + res1);
						}
					}
				} else {
					String res0 = (jo.get(key).toString() == null) ? "" : jo.get(key).toString();
					System.out.println(key + " :: " + res0);
				}
			}
		}

		System.out.println("\n This example for employees.json\n*********************************");
		Object obj2 = new JSONParser().parse(new FileReader("employees.json"));
		if (obj2 instanceof JSONArray) {
			JSONArray tempJsonArray0 = (JSONArray) obj2;
			for (int j = 0; j < tempJsonArray0.size(); j++) {
				if (tempJsonArray0.get(j) instanceof JSONObject) {
					JSONObject tempJsonObject0 = (JSONObject) tempJsonArray0.get(j);
					Set<String> tempSet0 = tempJsonObject0.keySet();
					Iterator<String> tempSetItr0 = tempSet0.iterator();
					while (tempSetItr0.hasNext()) {
						String key0 = tempSetItr0.next();
						if (tempJsonObject0.get(key0) instanceof JSONObject) {
							JSONObject tempJsonObject1 = (JSONObject) tempJsonObject0.get(key0);
							Set<String> tempSet1 = tempJsonObject1.keySet();
							Iterator<String> tempSetItr1 = tempSet1.iterator();
							while (tempSetItr1.hasNext()) {
								String key1 = tempSetItr1.next();
								String res1 = (tempJsonObject1.get(key1).toString() == null) ? ""
										: tempJsonObject1.get(key1).toString();
								System.out.println(key0 + " :: " + key1 + " :: " + res1);
							}
						} else {
							String res0 = (tempJsonObject0.get(key0).toString() == null) ? ""
									: tempJsonObject0.get(key0).toString();
							System.out.println(key0 + " :: " + res0);
						}
					}
				} else {
					String res = (tempJsonArray0.get(j).toString() == null) ? "" : tempJsonArray0.get(j).toString();
					System.out.println(res);
				}
			}
		}
	}
}