package com.tencent.mm.plugin.webview.modeltools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.g.a.oc.a;
import com.tencent.mm.g.a.od;
import com.tencent.mm.g.a.od.a;
import com.tencent.mm.g.a.of;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private a rGA;
  private c rGB;
  private c rGC;
  private c rGD;
  public String rGz;
  
  public d()
  {
    GMTrace.i(11977992699904L, 89243);
    this.rGz = null;
    this.rGB = new c() {};
    this.rGC = new c()
    {
      private boolean a(oc paramAnonymousoc)
      {
        GMTrace.i(11980811272192L, 89264);
        if (((paramAnonymousoc instanceof oc)) && ("bank".equals(d.this.rGz)))
        {
          if (paramAnonymousoc.eTa.action != 0) {
            break label71;
          }
          d.this.LC(d.this.rGz);
        }
        for (;;)
        {
          d.this.reset();
          GMTrace.o(11980811272192L, 89264);
          return false;
          label71:
          if (paramAnonymousoc.eTa.action == 1) {
            if (bg.nm(paramAnonymousoc.eTa.cardNum)) {
              d.this.Ij(d.this.rGz);
            } else {
              try
              {
                JSONObject localJSONObject = new JSONObject();
                localJSONObject.put("bankcard_number", paramAnonymousoc.eTa.cardNum);
                d.this.a(d.this.rGz, localJSONObject, null);
              }
              catch (JSONException paramAnonymousoc)
              {
                w.e("MicroMsg.LicenceScanner", "type = bankcard, add cardNum into json, exp = %s ", new Object[] { paramAnonymousoc });
                d.this.Ij(d.this.rGz);
              }
            }
          }
        }
      }
    };
    this.rGD = new c()
    {
      private boolean a(od paramAnonymousod)
      {
        GMTrace.i(11989938077696L, 89332);
        if (((paramAnonymousod instanceof od)) && (d.this.rGz.equalsIgnoreCase(paramAnonymousod.eTb.cardType)))
        {
          if (paramAnonymousod.eTb.eTc != 0) {
            break label76;
          }
          d.this.Ij(d.this.rGz);
        }
        for (;;)
        {
          d.this.reset();
          GMTrace.o(11989938077696L, 89332);
          return false;
          label76:
          if (paramAnonymousod.eTb.eTc == 2)
          {
            d.this.LC(d.this.rGz);
          }
          else
          {
            try
            {
              if (bg.nm(paramAnonymousod.eTb.eTd)) {
                break label193;
              }
              JSONObject localJSONObject = new JSONObject(paramAnonymousod.eTb.eTd);
              d.this.a(d.this.rGz, localJSONObject, paramAnonymousod.eTb.eTe);
            }
            catch (Exception paramAnonymousod)
            {
              w.e("MicroMsg.LicenceScanner", "Failed to parse json string: %s", new Object[] { paramAnonymousod.getMessage() });
              d.this.Ij(d.this.rGz);
            }
            continue;
            label193:
            d.this.a(d.this.rGz, null, paramAnonymousod.eTb.eTe);
          }
        }
      }
    };
    GMTrace.o(11977992699904L, 89243);
  }
  
  public final void Ij(String paramString)
  {
    GMTrace.i(16064922517504L, 119693);
    if (this.rGA != null) {
      this.rGA.Ij(paramString);
    }
    GMTrace.o(16064922517504L, 119693);
  }
  
  public final void LC(String paramString)
  {
    GMTrace.i(16064788299776L, 119692);
    if (this.rGA != null) {
      this.rGA.LC(paramString);
    }
    GMTrace.o(16064788299776L, 119692);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject, Bitmap paramBitmap)
  {
    GMTrace.i(16065056735232L, 119694);
    if (this.rGA != null) {
      this.rGA.a(paramString, paramJSONObject, paramBitmap);
    }
    GMTrace.o(16065056735232L, 119694);
  }
  
  public final boolean a(String paramString, Context paramContext, a parama)
  {
    GMTrace.i(11978126917632L, 89244);
    if ("bank".equalsIgnoreCase(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 7);
      paramString.putExtra("scan_bankcard_with_confirm_ui", true);
      paramString.addFlags(268435456);
      com.tencent.mm.bj.d.b(paramContext, "scanner", ".ui.BaseScanUI", paramString);
      this.rGA = parama;
      this.rGz = "bank";
      a.vgX.b(this.rGB);
      a.vgX.b(this.rGC);
      GMTrace.o(11978126917632L, 89244);
      return true;
    }
    if ("identity_pay_auth".equalsIgnoreCase(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 11);
      com.tencent.mm.bj.d.b(paramContext, "scanner", ".ui.BaseScanUI", paramString);
      this.rGA = parama;
      this.rGz = "identity";
      a.vgX.b(this.rGB);
      a.vgX.b(this.rGD);
      GMTrace.o(11978126917632L, 89244);
      return true;
    }
    GMTrace.o(11978126917632L, 89244);
    return false;
  }
  
  public final void reset()
  {
    GMTrace.i(16064654082048L, 119691);
    this.rGA = null;
    a.vgX.c(this.rGB);
    a.vgX.c(this.rGC);
    a.vgX.c(this.rGD);
    GMTrace.o(16064654082048L, 119691);
  }
  
  public static abstract interface a
  {
    public abstract void Ij(String paramString);
    
    public abstract void LC(String paramString);
    
    public abstract void a(String paramString, JSONObject paramJSONObject, Bitmap paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */