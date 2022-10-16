package com.alvaro.retonapptilus;

public class InitData {
	
	String url;
	
    int serverPort;
	
	public InitData() {
		url = "http://localhost:"+serverPort+"/prices?instante={instante}&productId={productId}&brandId={brandId}";
	}
}
