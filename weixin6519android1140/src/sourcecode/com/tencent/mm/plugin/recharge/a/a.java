package com.tencent.mm.plugin.recharge.a;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class a
  implements aq
{
  private List<com.tencent.mm.plugin.recharge.model.a> odB;
  
  public a()
  {
    GMTrace.i(7909584928768L, 58931);
    this.odB = null;
    GMTrace.o(7909584928768L, 58931);
  }
  
  public static a baj()
  {
    GMTrace.i(7909719146496L, 58932);
    a locala = (a)p.o(a.class);
    GMTrace.o(7909719146496L, 58932);
    return locala;
  }
  
  public static com.tencent.mm.plugin.recharge.model.a bal()
  {
    GMTrace.i(16554414571520L, 123340);
    Object localObject = (String)h.xy().xh().get(6, null);
    if (!bg.nm((String)localObject))
    {
      localObject = new com.tencent.mm.plugin.recharge.model.a((String)localObject, ab.getContext().getString(a.i.tfF), 3);
      GMTrace.o(16554414571520L, 123340);
      return (com.tencent.mm.plugin.recharge.model.a)localObject;
    }
    GMTrace.o(16554414571520L, 123340);
    return null;
  }
  
  public final boolean a(com.tencent.mm.plugin.recharge.model.a parama)
  {
    GMTrace.i(7910524452864L, 58938);
    if ((parama != null) && (PhoneNumberUtils.isGlobalPhoneNumber(parama.odE)))
    {
      List localList = bak();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)localIterator.next();
        if (parama.odE.equals(locala.odE))
        {
          if (bg.nm(parama.name)) {
            parama.name = locala.name;
          }
          localList.remove(locala);
        }
      }
      localList.add(0, parama);
      bi(localList);
      GMTrace.o(7910524452864L, 58938);
      return true;
    }
    GMTrace.o(7910524452864L, 58938);
    return false;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7910256017408L, 58936);
    GMTrace.o(7910256017408L, 58936);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7910121799680L, 58935);
    GMTrace.o(7910121799680L, 58935);
  }
  
  public final List<com.tencent.mm.plugin.recharge.model.a> bak()
  {
    GMTrace.i(7910792888320L, 58940);
    if (this.odB != null)
    {
      localObject = this.odB;
      GMTrace.o(7910792888320L, 58940);
      return (List<com.tencent.mm.plugin.recharge.model.a>)localObject;
    }
    this.odB = new LinkedList();
    localObject = (String)h.xy().xh().get(270337, null);
    if (bg.nm((String)localObject))
    {
      w.i("MicroMsg.SubCoreRecharge", "empty history");
      localObject = this.odB;
      GMTrace.o(7910792888320L, 58940);
      return (List<com.tencent.mm.plugin.recharge.model.a>)localObject;
    }
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject);
      int i = 0;
      while (i < Math.min(localJSONArray.length(), 100))
      {
        com.tencent.mm.plugin.recharge.model.a locala = com.tencent.mm.plugin.recharge.model.a.K(localJSONArray.getJSONObject(i));
        if (locala != null) {
          this.odB.add(locala);
        }
        i += 1;
      }
      String[] arrayOfString;
      return (List<com.tencent.mm.plugin.recharge.model.a>)localObject;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.SubCoreRecharge", localJSONException, "", new Object[0]);
      localObject = ((String)localObject).split("&");
      if ((localObject != null) && (localObject.length > 0))
      {
        i = 0;
        if (i < Math.min(localObject.length, 100))
        {
          arrayOfString = localObject[i].split("=");
          if (arrayOfString.length == 2) {
            this.odB.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], arrayOfString[1], 2));
          }
          for (;;)
          {
            i += 1;
            break;
            if (arrayOfString.length == 1) {
              this.odB.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], "", 2));
            }
          }
        }
      }
      w.i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.odB.size());
      localObject = this.odB;
      GMTrace.o(7910792888320L, 58940);
    }
  }
  
  public final void bi(List<com.tencent.mm.plugin.recharge.model.a> paramList)
  {
    GMTrace.i(7910658670592L, 58939);
    this.odB = paramList;
    if ((paramList == null) || (paramList.size() == 0)) {
      this.odB = new LinkedList();
    }
    for (;;)
    {
      paramList = new JSONArray();
      Iterator localIterator = this.odB.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)localIterator.next();
        paramList.put(locala.bam());
        w.i("MicroMsg.SubCoreRecharge", "number: %s", new Object[] { locala.name });
      }
      if (paramList.size() > 10)
      {
        int i = paramList.size() - 1;
        while (i >= 10)
        {
          paramList.remove(i);
          i -= 1;
        }
      }
    }
    w.d("MicroMsg.SubCoreRecharge", "setMobileHistory : " + paramList.toString());
    h.xy().xh().set(270337, paramList.toString());
    h.xy().xh().kL(true);
    GMTrace.o(7910658670592L, 58939);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7909987581952L, 58934);
    GMTrace.o(7909987581952L, 58934);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7910390235136L, 58937);
    GMTrace.o(7910390235136L, 58937);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7909853364224L, 58933);
    GMTrace.o(7909853364224L, 58933);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */