package com.notify.it.controller;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.InfoWindow;
import com.lynden.gmapsfx.javascript.object.InfoWindowOptions;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import com.notify.it.util.ItensEstaticos;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

//
public class AcompanhamentoController implements Initializable, MapComponentInitializedListener {
    
	@FXML
	private TextArea txMensagem;
	
	@FXML
	private Button btVoltar;
    @FXML
    private Button button;
    
    @FXML
    private GoogleMapView mapView;
    
    private GoogleMap map;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mapView.addMapInializedListener(this);
    }
    
    @Override
    public void mapInitialized() {
    	//LatLong Path00 = new LatLong(-30.079176926794396, -51.217891573905945);
    	LatLong Path01 = new LatLong(-30.078540969199885, -51.21701717376709);
    	LatLong Path02 = new LatLong(-30.077338673233918, -51.215359568595886);
    	LatLong Path03 = new LatLong(-30.076809472695032, -51.21457099914551);
    	LatLong Path04 = new LatLong(-30.07802570128938, -51.21431350708008);
    	LatLong Path05 = new LatLong(-30.079344039060636, -51.21395945549011);
    	LatLong Path06 = new LatLong(-30.080383842373976, -51.21307969093323);
    	LatLong Path07 = new LatLong(-30.081395783318072, -51.21179223060608);
    	LatLong Path08 = new LatLong(-30.08095944307961, -51.21050477027893);
    	LatLong Path09 = new LatLong(-30.07945544708129, -51.209410429000854);
    	LatLong Path10 = new LatLong(-30.07796999648966, -51.2082839012146);
    	LatLong Path11 = new LatLong(-30.077023010095253, -51.20721101760864);
    	LatLong Path12 = new LatLong(-30.075992455778042, -51.20579481124878);
    	LatLong Path13 = new LatLong(-30.07495260630745, -51.20446443557739);
    	LatLong Path14 = new LatLong(-30.074079867066416, -51.202898025512695);
       
        
        
        //Set the initial properties of the map.
        MapOptions mapOptions = new MapOptions();
        
        mapOptions.center(Path09)
                .mapType(MapTypeIdEnum.ROADMAP)
                .overviewMapControl(false)
                .panControl(false)
                .rotateControl(false)
                .scaleControl(false)
                .streetViewControl(false)
                .zoomControl(false)
                .zoom(14);
                   
        map = mapView.createMap(mapOptions);

        //Add markers to the map
        MarkerOptions markerOptions01 = new MarkerOptions();
        markerOptions01.position(Path01);
        
        MarkerOptions markerOptions02 = new MarkerOptions();
        markerOptions02.position(Path02);
        
        MarkerOptions markerOptions03 = new MarkerOptions();
        markerOptions03.position(Path03);
        
        MarkerOptions markerOptions04 = new MarkerOptions();
        markerOptions04.position(Path04);
        
        MarkerOptions markerOptions05 = new MarkerOptions();
        markerOptions05.position(Path05);
        
        MarkerOptions markerOptions06 = new MarkerOptions();
        markerOptions06.position(Path06);
        
        MarkerOptions markerOptions07 = new MarkerOptions();
        markerOptions07.position(Path07);
        
        MarkerOptions markerOptions08 = new MarkerOptions();
        markerOptions08.position(Path08);
        
        MarkerOptions markerOptions09 = new MarkerOptions();
        markerOptions09.position(Path09);
        
        MarkerOptions markerOptions10 = new MarkerOptions();
        markerOptions10.position(Path10);
        
        MarkerOptions markerOptions11 = new MarkerOptions();
        markerOptions11.position(Path11);
        
        MarkerOptions markerOptions12 = new MarkerOptions();
        markerOptions12.position(Path12);
        
        MarkerOptions markerOptions13 = new MarkerOptions();
        markerOptions13.position(Path13);
        
        Marker marker09 = new Marker(markerOptions09);
        MarkerOptions markerOptions14 = new MarkerOptions();
        markerOptions14.position(Path14);
        List<Marker> markers = Arrays.asList(
        	new Marker(markerOptions01),
        	new Marker(markerOptions02),
        	new Marker(markerOptions03),
        	new Marker(markerOptions04),
        	new Marker(markerOptions05),
        	new Marker(markerOptions06),
        	new Marker(markerOptions07),
        	new Marker(markerOptions08),
        	marker09,
        	new Marker(markerOptions10),
        	new Marker(markerOptions11),
        	new Marker(markerOptions12),
        	new Marker(markerOptions13),
        	new Marker(markerOptions14)
        );
        for (Marker marker : markers) {
			map.addMarker(marker);
		}
        
        InfoWindowOptions infoWindowOptions = new InfoWindowOptions();
        infoWindowOptions.content("<h2>Fred</h2>"
                                + "Localização: Rua Sepé Tiaraju<br>"
                                + "Tempo até chegada: 5 minutos" );

        InfoWindow fredWilkeInfoWindow = new InfoWindow(infoWindowOptions);
        fredWilkeInfoWindow.open(map, marker09);
    }   
    public void Voltar() {
    	ItensEstaticos.getStageAcompanhamento().close();
    }
}