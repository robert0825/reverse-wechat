package com.samsung.android.sdk.look.airbutton;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

public class SlookAirButtonAdapter
{
  private CharSequence mEmptyText;
  private ArrayList<AirButtonItem> mItemList = null;
  
  public SlookAirButtonAdapter() {}
  
  public SlookAirButtonAdapter(ArrayList<AirButtonItem> paramArrayList)
  {
    addItem(paramArrayList);
  }
  
  public int addItem(ArrayList<AirButtonItem> paramArrayList)
  {
    if (this.mItemList != null) {
      this.mItemList.clear();
    }
    this.mItemList = paramArrayList;
    return this.mItemList.size() - 1;
  }
  
  public void addItem(AirButtonItem paramAirButtonItem)
  {
    if (this.mItemList == null) {
      this.mItemList = new ArrayList();
    }
    this.mItemList.add(paramAirButtonItem);
  }
  
  public void clear()
  {
    if (this.mItemList == null) {
      return;
    }
    this.mItemList.clear();
  }
  
  public int getCount()
  {
    if (this.mItemList == null) {
      return 0;
    }
    return this.mItemList.size();
  }
  
  public CharSequence getEmptyText()
  {
    return this.mEmptyText;
  }
  
  public AirButtonItem getItem(int paramInt)
  {
    if ((this.mItemList != null) && (paramInt < this.mItemList.size())) {
      return (AirButtonItem)this.mItemList.get(paramInt);
    }
    return null;
  }
  
  public void insertItem(int paramInt, AirButtonItem paramAirButtonItem)
  {
    if (this.mItemList == null)
    {
      if (paramInt == 0)
      {
        addItem(paramAirButtonItem);
        return;
      }
      throw new IllegalArgumentException("The list is empty.");
    }
    this.mItemList.add(paramInt, paramAirButtonItem);
  }
  
  public void onDismiss(View paramView) {}
  
  public void onHide(View paramView) {}
  
  public boolean onHoverEnter(View paramView)
  {
    return true;
  }
  
  public void onHoverExit(View paramView) {}
  
  public void onShow(View paramView) {}
  
  public void removeItem(int paramInt)
  {
    if (this.mItemList == null) {
      throw new IllegalArgumentException("The list is empty.");
    }
    this.mItemList.remove(paramInt);
  }
  
  public void setEmptyText(CharSequence paramCharSequence)
  {
    this.mEmptyText = paramCharSequence;
  }
  
  public void updateItem(int paramInt, AirButtonItem paramAirButtonItem)
  {
    if (this.mItemList == null) {
      throw new IllegalArgumentException("The list is empty.");
    }
    this.mItemList.set(paramInt, paramAirButtonItem);
  }
  
  public static class AirButtonItem
  {
    private Object mData = null;
    private String mDescription = null;
    private Drawable mImage = null;
    private String mSubDescription = null;
    private View mView = null;
    
    public AirButtonItem(Drawable paramDrawable, String paramString, Object paramObject)
    {
      if ((paramDrawable == null) && (paramString == null) && (paramObject == null)) {
        throw new IllegalArgumentException("You should set the Drawable, String and Object in Param");
      }
      set(paramDrawable, paramString, paramObject);
    }
    
    public AirButtonItem(Drawable paramDrawable, String paramString1, String paramString2, Object paramObject)
    {
      if ((paramDrawable == null) && (paramString1 == null) && (paramString2 == null) && (paramObject == null)) {
        throw new IllegalArgumentException("You should set the Drawable, String, subDescription and Object in Param");
      }
      set(paramDrawable, paramString1, paramString2, paramObject);
    }
    
    public AirButtonItem(View paramView, Object paramObject)
    {
      if ((paramView == null) && (paramObject == null)) {
        throw new IllegalArgumentException("You should set the View and Object in Param");
      }
      set(paramView, paramObject);
    }
    
    public Object getData()
    {
      return this.mData;
    }
    
    public String getDescription()
    {
      return this.mDescription;
    }
    
    public Drawable getImage()
    {
      return this.mImage;
    }
    
    public String getSubDescription()
    {
      return this.mSubDescription;
    }
    
    public View getView()
    {
      return this.mView;
    }
    
    public void set(Drawable paramDrawable, String paramString, Object paramObject)
    {
      this.mImage = paramDrawable;
      this.mDescription = paramString;
      this.mData = paramObject;
    }
    
    public void set(Drawable paramDrawable, String paramString1, String paramString2, Object paramObject)
    {
      this.mImage = paramDrawable;
      this.mDescription = paramString1;
      this.mSubDescription = paramString2;
      this.mData = paramObject;
    }
    
    public void set(View paramView, Object paramObject)
    {
      this.mView = paramView;
      this.mData = paramObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\airbutton\SlookAirButtonAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */