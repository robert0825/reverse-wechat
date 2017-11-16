package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import com.tencent.mm.sdk.platformtools.v;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

final class a
  extends c
{
  volatile Long ijA;
  volatile int ijB;
  volatile int ijC;
  volatile int ijD;
  volatile a ijy;
  volatile Long ijz;
  
  a()
  {
    GMTrace.i(10379459559424L, 77333);
    this.ijz = null;
    this.ijA = null;
    this.ijB = -1;
    this.ijC = -1;
    this.ijD = -1;
    GMTrace.o(10379459559424L, 77333);
  }
  
  final void l(JSONObject paramJSONObject)
  {
    GMTrace.i(10379593777152L, 77334);
    this.ijy = a.qN(paramJSONObject.optString("fields"));
    Object localObject2 = paramJSONObject.optJSONObject("range");
    if (localObject2 != null)
    {
      localObject1 = ((JSONObject)localObject2).optString("start", "");
      localObject1 = this.ijy.parse((String)localObject1);
      localObject2 = ((JSONObject)localObject2).optString("end", "");
      localObject2 = this.ijy.parse((String)localObject2);
      if (localObject1 != null) {
        this.ijz = Long.valueOf(((Date)localObject1).getTime());
      }
      if (localObject2 != null) {
        this.ijA = Long.valueOf(((Date)localObject2).getTime());
      }
    }
    if (this.ijz == null)
    {
      localObject1 = Calendar.getInstance(v.vhV);
      ((Calendar)localObject1).set(1900, 0, 1);
      this.ijz = Long.valueOf(((Calendar)localObject1).getTimeInMillis());
    }
    if (this.ijA == null)
    {
      localObject1 = Calendar.getInstance(v.vhV);
      ((Calendar)localObject1).set(2100, 11, 31);
      this.ijA = Long.valueOf(((Calendar)localObject1).getTimeInMillis());
    }
    paramJSONObject = paramJSONObject.optString("current", "");
    Object localObject1 = this.ijy.parse(paramJSONObject);
    paramJSONObject = (JSONObject)localObject1;
    if (localObject1 == null) {
      paramJSONObject = new Date(System.currentTimeMillis());
    }
    this.ijB = (paramJSONObject.getYear() + 1900);
    this.ijC = (paramJSONObject.getMonth() + 1);
    this.ijD = paramJSONObject.getDate();
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        boolean bool3 = true;
        int j = 0;
        GMTrace.i(10380130648064L, 77338);
        Object localObject2 = a.this;
        Object localObject1 = (com.tencent.mm.plugin.appbrand.widget.picker.c)((a)localObject2).r(com.tencent.mm.plugin.appbrand.widget.picker.c.class);
        if (localObject1 == null)
        {
          ((c)localObject2).e("fail cant init view", null);
          GMTrace.o(10380130648064L, 77338);
          return;
        }
        com.tencent.mm.plugin.appbrand.widget.picker.a locala = ((b)localObject2).iRs;
        locala.iRS = new a.2((a)localObject2);
        ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).a(((a)localObject2).ijB, ((a)localObject2).ijC, ((a)localObject2).ijD, null);
        if (((a)localObject2).ijz != null) {
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).setMinDate(((a)localObject2).ijz.longValue());
        }
        if (((a)localObject2).ijA != null) {
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).setMaxDate(((a)localObject2).ijA.longValue());
        }
        boolean bool1;
        boolean bool2;
        if (((a)localObject2).ijy.ordinal() >= a.a.ijF.ordinal())
        {
          bool1 = true;
          if (((a)localObject2).ijy.ordinal() < a.a.ijG.ordinal()) {
            break label344;
          }
          bool2 = true;
          label176:
          if (((a)localObject2).ijy.ordinal() < a.a.ijH.ordinal()) {
            break label350;
          }
          label193:
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRt = bool1;
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRu = bool2;
          ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRv = bool3;
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRw != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRw.setEnabled(bool1);
            localObject2 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRw;
            if (!bool1) {
              break label356;
            }
            i = 0;
            label243:
            ((NumberPicker)localObject2).setVisibility(i);
          }
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRx != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRx.setEnabled(bool2);
            localObject2 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRx;
            if (!bool2) {
              break label362;
            }
            i = 0;
            label281:
            ((NumberPicker)localObject2).setVisibility(i);
          }
          if (((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRy != null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRy.setEnabled(bool3);
            localObject1 = ((com.tencent.mm.plugin.appbrand.widget.picker.c)localObject1).iRy;
            if (!bool3) {
              break label368;
            }
          }
        }
        label344:
        label350:
        label356:
        label362:
        label368:
        for (int i = j;; i = 8)
        {
          ((NumberPicker)localObject1).setVisibility(i);
          locala.show();
          GMTrace.o(10380130648064L, 77338);
          return;
          bool1 = false;
          break;
          bool2 = false;
          break label176;
          bool3 = false;
          break label193;
          i = 8;
          break label243;
          i = 8;
          break label281;
        }
      }
    });
    GMTrace.o(10379593777152L, 77334);
  }
  
  private static enum a
  {
    final DateFormat ijI;
    
    static
    {
      GMTrace.i(10379325341696L, 77332);
      ijF = new a("YEAR", 0, new SimpleDateFormat("yyyy", Locale.US));
      ijG = new a("MONTH", 1, new SimpleDateFormat("yyyy-MM", Locale.US));
      ijH = new a("DAY", 2, new SimpleDateFormat("yyyy-MM-dd", Locale.US));
      ijJ = new a[] { ijF, ijG, ijH };
      GMTrace.o(10379325341696L, 77332);
    }
    
    private a(DateFormat paramDateFormat)
    {
      GMTrace.i(10378922688512L, 77329);
      this.ijI = paramDateFormat;
      GMTrace.o(10378922688512L, 77329);
    }
    
    static a qN(String paramString)
    {
      int i = 0;
      GMTrace.i(10379056906240L, 77330);
      paramString = paramString.substring(0, Math.max(0, Math.min(paramString.length(), 5))).toLowerCase();
      switch (paramString.hashCode())
      {
      default: 
        label68:
        i = -1;
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          paramString = ijG;
          GMTrace.o(10379056906240L, 77330);
          return paramString;
          if (!paramString.equals("year")) {
            break label68;
          }
          continue;
          if (!paramString.equals("month")) {
            break label68;
          }
          i = 1;
          continue;
          if (!paramString.equals("day")) {
            break label68;
          }
          i = 2;
        }
      }
      paramString = ijF;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
      paramString = ijG;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
      paramString = ijH;
      GMTrace.o(10379056906240L, 77330);
      return paramString;
    }
    
    final Date parse(String paramString)
    {
      GMTrace.i(10379191123968L, 77331);
      try
      {
        paramString = this.ijI.parse(paramString);
        GMTrace.o(10379191123968L, 77331);
        return paramString;
      }
      catch (Exception paramString)
      {
        GMTrace.o(10379191123968L, 77331);
      }
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */