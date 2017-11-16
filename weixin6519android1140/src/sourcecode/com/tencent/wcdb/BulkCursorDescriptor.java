package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BulkCursorDescriptor
  implements Parcelable
{
  public static final Parcelable.Creator<BulkCursorDescriptor> CREATOR = new Parcelable.Creator()
  {
    public final BulkCursorDescriptor createFromParcel(Parcel paramAnonymousParcel)
    {
      BulkCursorDescriptor localBulkCursorDescriptor = new BulkCursorDescriptor();
      localBulkCursorDescriptor.readFromParcel(paramAnonymousParcel);
      return localBulkCursorDescriptor;
    }
    
    public final BulkCursorDescriptor[] newArray(int paramAnonymousInt)
    {
      return new BulkCursorDescriptor[paramAnonymousInt];
    }
  };
  public String[] columnNames;
  public int count;
  public IBulkCursor cursor;
  public boolean wantsAllOnMoveCalls;
  public CursorWindow window;
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void readFromParcel(Parcel paramParcel)
  {
    this.cursor = BulkCursorNative.asInterface(paramParcel.readStrongBinder());
    this.columnNames = readStringArray(paramParcel);
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.wantsAllOnMoveCalls = bool;
      this.count = paramParcel.readInt();
      if (paramParcel.readInt() != 0) {
        this.window = ((CursorWindow)CursorWindow.CREATOR.createFromParcel(paramParcel));
      }
      return;
    }
  }
  
  public final String[] readStringArray(Parcel paramParcel)
  {
    Object localObject = null;
    int j = paramParcel.readInt();
    if (j >= 0)
    {
      String[] arrayOfString = new String[j];
      int i = 0;
      for (;;)
      {
        localObject = arrayOfString;
        if (i >= j) {
          break;
        }
        arrayOfString[i] = paramParcel.readString();
        i += 1;
      }
    }
    return (String[])localObject;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.cursor.asBinder());
    paramParcel.writeStringArray(this.columnNames);
    if (this.wantsAllOnMoveCalls) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.count);
      if (this.window == null) {
        break;
      }
      paramParcel.writeInt(1);
      this.window.writeToParcel(paramParcel, paramInt);
      return;
    }
    paramParcel.writeInt(0);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\wcdb\BulkCursorDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */