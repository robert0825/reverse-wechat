package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.h.a;
import com.tencent.mm.sdk.platformtools.w;

public abstract interface b
{
  public abstract void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2);
  
  public abstract boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult);
  
  public abstract boolean awA();
  
  public abstract boolean awB();
  
  public abstract void awC();
  
  public abstract b awD();
  
  public abstract a awE();
  
  public abstract boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult);
  
  public static final class a
  {
    public String eAR;
    public int kUa;
    public int kUb;
    
    a()
    {
      GMTrace.i(14543430352896L, 108357);
      this.kUa = 1;
      GMTrace.o(14543430352896L, 108357);
    }
    
    a(String paramString)
    {
      GMTrace.i(5954435284992L, 44364);
      this.kUb = 7;
      this.eAR = paramString;
      GMTrace.o(5954435284992L, 44364);
    }
  }
  
  public static final class b
  {
    public String eAR;
    public int errCode;
    
    public b(int paramInt, String paramString)
    {
      GMTrace.i(15041109688320L, 112065);
      this.errCode = paramInt;
      this.eAR = paramString;
      GMTrace.o(15041109688320L, 112065);
    }
  }
  
  public static final class c
  {
    private static String TAG;
    
    static
    {
      GMTrace.i(5954703720448L, 44366);
      TAG = "MicroMsg.IFaceMotion.Factory";
      GMTrace.o(5954703720448L, 44366);
    }
    
    public static b a(h.a parama)
    {
      GMTrace.i(5954569502720L, 44365);
      if (parama == null)
      {
        GMTrace.o(5954569502720L, 44365);
        return null;
      }
      if (parama.type == 4)
      {
        w.i(TAG, "hy: is read number");
        parama = new d(parama.kSY);
        GMTrace.o(5954569502720L, 44365);
        return parama;
      }
      w.i(TAG, "hy: is normal");
      parama = new c(parama.hvl, parama.kSV);
      GMTrace.o(5954569502720L, 44365);
      return parama;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */