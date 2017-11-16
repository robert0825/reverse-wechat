package com.tencent.tencentmap.mapsdk.map;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MapActivity
  extends Activity
{
  private List<MapView> mapViewList = new ArrayList();
  private Bundle mysavedInstanceState;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mysavedInstanceState = paramBundle;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Iterator localIterator = this.mapViewList.iterator();
    while (localIterator.hasNext())
    {
      MapView localMapView = (MapView)localIterator.next();
      if (localMapView != null) {
        localMapView.onDestroy();
      }
    }
    this.mapViewList.clear();
  }
  
  public void onPause()
  {
    super.onPause();
    Iterator localIterator = this.mapViewList.iterator();
    while (localIterator.hasNext())
    {
      MapView localMapView = (MapView)localIterator.next();
      if (localMapView != null) {
        localMapView.onPause();
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
    Iterator localIterator = this.mapViewList.iterator();
    while (localIterator.hasNext())
    {
      MapView localMapView = (MapView)localIterator.next();
      if (localMapView != null) {
        localMapView.onResume();
      }
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Iterator localIterator = this.mapViewList.iterator();
    while (localIterator.hasNext())
    {
      MapView localMapView = (MapView)localIterator.next();
      if (localMapView != null) {
        localMapView.onSaveInstanceState(paramBundle);
      }
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    Iterator localIterator = this.mapViewList.iterator();
    while (localIterator.hasNext())
    {
      MapView localMapView = (MapView)localIterator.next();
      if (localMapView != null) {
        localMapView.onStop();
      }
    }
  }
  
  public void setMapView(MapView paramMapView)
  {
    this.mapViewList.add(paramMapView);
    paramMapView.onCreate(this.mysavedInstanceState);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\MapActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */