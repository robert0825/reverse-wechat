package com.tencent.mm.au;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

public abstract class a
{
  public static String gOQ;
  public static String gOR;
  public String TEXT;
  public String TYPE;
  public au eRz;
  public String gOS;
  public String gOT;
  public LinkedList<String> gOU;
  public LinkedList<Integer> gOV;
  public LinkedList<Integer> gOW;
  public Map<String, String> values;
  
  static
  {
    GMTrace.i(13244202745856L, 98677);
    gOQ = "";
    gOR = "";
    GMTrace.o(13244202745856L, 98677);
  }
  
  a(Map<String, String> paramMap)
  {
    GMTrace.i(13243665874944L, 98673);
    this.gOS = "";
    this.gOU = new LinkedList();
    this.gOV = new LinkedList();
    this.gOW = new LinkedList();
    this.values = paramMap;
    GMTrace.o(13243665874944L, 98673);
  }
  
  a(Map<String, String> paramMap, au paramau)
  {
    GMTrace.i(13243800092672L, 98674);
    this.gOS = "";
    this.gOU = new LinkedList();
    this.gOV = new LinkedList();
    this.gOW = new LinkedList();
    this.values = paramMap;
    this.eRz = paramau;
    GMTrace.o(13243800092672L, 98674);
  }
  
  public final boolean Ka()
  {
    GMTrace.i(13243934310400L, 98675);
    if ((this.values != null) && (this.values.size() > 0))
    {
      if (this.values.containsKey(".sysmsg.$type")) {
        this.TYPE = ((String)this.values.get(".sysmsg.$type"));
      }
      gOQ = ".sysmsg." + this.TYPE + ".text";
      if (this.values.containsKey(gOQ)) {
        this.TEXT = ((String)this.values.get(gOQ));
      }
      gOR = ".sysmsg." + this.TYPE + ".link.scene";
      if (this.values.containsKey(gOR)) {
        this.gOT = ((String)this.values.get(gOR));
      }
      boolean bool = Kb();
      GMTrace.o(13243934310400L, 98675);
      return bool;
    }
    w.e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
    GMTrace.o(13243934310400L, 98675);
    return false;
  }
  
  protected abstract boolean Kb();
  
  public static abstract class a
  {
    private static HashMap<String, a> gOX;
    
    static
    {
      GMTrace.i(13244873834496L, 98682);
      gOX = new HashMap();
      GMTrace.o(13244873834496L, 98682);
    }
    
    public a()
    {
      GMTrace.i(13244336963584L, 98678);
      GMTrace.o(13244336963584L, 98678);
    }
    
    public static void a(String paramString, a parama)
    {
      GMTrace.i(13244605399040L, 98680);
      Assert.assertNotNull(paramString);
      Assert.assertNotNull(parama);
      synchronized (gOX)
      {
        gOX.put(paramString.toLowerCase(), parama);
        GMTrace.o(13244605399040L, 98680);
        return;
      }
    }
    
    public static a b(Map<String, String> paramMap, au paramau)
    {
      GMTrace.i(13244739616768L, 98681);
      if (paramMap == null)
      {
        w.e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        GMTrace.o(13244739616768L, 98681);
        return null;
      }
      String str = (String)paramMap.get(".sysmsg.$type");
      synchronized (gOX)
      {
        a locala = (a)gOX.get(str.toLowerCase());
        if (locala == null)
        {
          w.w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", new Object[] { str });
          GMTrace.o(13244739616768L, 98681);
          return null;
        }
        paramMap = locala.a(paramMap, paramau);
        GMTrace.o(13244739616768L, 98681);
        return paramMap;
      }
    }
    
    public abstract a a(Map<String, String> paramMap, au paramau);
  }
  
  public static abstract interface b
  {
    public abstract void a(View paramView, au paramau, a parama, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\au\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */