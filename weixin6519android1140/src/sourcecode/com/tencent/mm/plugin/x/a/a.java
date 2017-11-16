package com.tencent.mm.plugin.x.a;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import java.util.LinkedList;

public abstract interface a
{
  public abstract f Et(String paramString);
  
  public abstract void Eu(String paramString);
  
  public abstract Bitmap a(String paramString, int paramInt, float paramFloat);
  
  public abstract i aWB();
  
  public abstract Cursor aWC();
  
  public abstract void aa(LinkedList<String> paramLinkedList);
  
  public abstract void bC(String paramString, int paramInt);
  
  public abstract void c(f paramf);
  
  public abstract Cursor cJ(int paramInt1, int paramInt2);
  
  public abstract void d(f paramf);
  
  public abstract void e(f paramf);
  
  public abstract Cursor l(int[] paramArrayOfInt);
  
  public abstract Cursor sn(int paramInt);
  
  public static final class a
  {
    private static a nDF;
    
    static
    {
      GMTrace.i(18733842038784L, 139578);
      nDF = null;
      GMTrace.o(18733842038784L, 139578);
    }
    
    public static void a(a parama)
    {
      GMTrace.i(18733573603328L, 139576);
      nDF = parama;
      GMTrace.o(18733573603328L, 139576);
    }
    
    public static a aWD()
    {
      GMTrace.i(18733707821056L, 139577);
      a locala = nDF;
      GMTrace.o(18733707821056L, 139577);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\x\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */