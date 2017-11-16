package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class a
{
  boolean ids;
  boolean idt;
  HashMap<Integer, AppBrandCameraView> idu;
  
  public a()
  {
    GMTrace.i(19837782851584L, 147803);
    this.ids = true;
    this.idt = true;
    this.idu = new HashMap();
    GMTrace.o(19837782851584L, 147803);
  }
  
  public final boolean Wy()
  {
    GMTrace.i(19838051287040L, 147805);
    if (!this.ids) {
      w.i("MicroMsg.AppBrandCameraMrg", "no camera permission");
    }
    boolean bool = this.ids;
    GMTrace.o(19838051287040L, 147805);
    return bool;
  }
  
  public final boolean g(Integer paramInteger)
  {
    GMTrace.i(19837917069312L, 147804);
    if (this.idu.containsKey(paramInteger))
    {
      ((AppBrandCameraView)this.idu.remove(paramInteger)).release();
      GMTrace.o(19837917069312L, 147804);
      return true;
    }
    GMTrace.o(19837917069312L, 147804);
    return false;
  }
  
  private static final class a
  {
    public static a idv;
    
    static
    {
      GMTrace.i(19835232714752L, 147784);
      idv = new a();
      GMTrace.o(19835232714752L, 147784);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */