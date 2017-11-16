package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.sdk.platformtools.w;

public final class XIPCInvoker
{
  public static <T extends i<InputType, ResultType>, InputType, ResultType> ResultType a(String paramString, InputType paramInputType, Class<T> paramClass)
  {
    GMTrace.i(18915304407040L, 140930);
    paramString = (WrapperParcelable)e.a(paramString, new WrapperParcelable(paramClass.getName(), paramInputType), b.class);
    if (paramString == null)
    {
      w.w("IPC.XIPCInvoker", "sync invoke error, wrapper parcelable data is null!");
      GMTrace.o(18915304407040L, 140930);
      return null;
    }
    paramString = paramString.fVM;
    GMTrace.o(18915304407040L, 140930);
    return paramString;
  }
  
  public static <T extends g<InputType, ResultType>, InputType, ResultType> void a(String paramString, InputType paramInputType, Class<T> paramClass, h<ResultType> paramh)
  {
    GMTrace.i(18947114008576L, 141167);
    e.a(paramString, new WrapperParcelable(paramClass.getName(), paramInputType), a.class, new h() {});
    GMTrace.o(18947114008576L, 141167);
  }
  
  private static class WrapperParcelable
    implements Parcelable
  {
    public static final Parcelable.Creator<WrapperParcelable> CREATOR;
    Object fVM;
    String fVO;
    
    static
    {
      GMTrace.i(18715454210048L, 139441);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18715454210048L, 139441);
    }
    
    public WrapperParcelable()
    {
      GMTrace.i(18714917339136L, 139437);
      GMTrace.o(18714917339136L, 139437);
    }
    
    public WrapperParcelable(String paramString, Object paramObject)
    {
      GMTrace.i(18715051556864L, 139438);
      this.fVO = paramString;
      this.fVM = paramObject;
      GMTrace.o(18715051556864L, 139438);
    }
    
    public int describeContents()
    {
      GMTrace.i(18715185774592L, 139439);
      GMTrace.o(18715185774592L, 139439);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18715319992320L, 139440);
      paramParcel.writeString(this.fVO);
      if (this.fVM != null)
      {
        a locala = c.ao(this.fVM);
        if (locala != null)
        {
          paramParcel.writeInt(1);
          paramParcel.writeString(locala.getClass().getName());
          locala.a(this.fVM, paramParcel);
          GMTrace.o(18715319992320L, 139440);
          return;
        }
      }
      paramParcel.writeInt(0);
      GMTrace.o(18715319992320L, 139440);
    }
  }
  
  private static class a
    implements g<XIPCInvoker.WrapperParcelable, XIPCInvoker.WrapperParcelable>
  {
    private a()
    {
      GMTrace.i(18716662169600L, 139450);
      GMTrace.o(18716662169600L, 139450);
    }
  }
  
  private static class b
    implements i<XIPCInvoker.WrapperParcelable, XIPCInvoker.WrapperParcelable>
  {
    private b()
    {
      GMTrace.i(18715856863232L, 139444);
      GMTrace.o(18715856863232L, 139444);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\XIPCInvoker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */