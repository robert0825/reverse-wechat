package com.tencent.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  implements Runnable
{
  public static long aKZ = -1L;
  private a aKX = null;
  int aKY = 0;
  private Context mContext = null;
  private int mType = 0;
  
  public n(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.mType = paramInt;
  }
  
  private void b(JSONObject paramJSONObject)
  {
    if ((i.aKN == null) || (j.aKT == 1)) {
      return;
    }
    if ((j.aKU > 0) && (this.aKY > j.aKU))
    {
      new StringBuilder("limit dispatch:").append(j.aKU);
      return;
    }
    paramJSONObject = new m(this.mContext, paramJSONObject).on().toString();
    i.aKN.aS("[" + paramJSONObject + "]");
    aKZ = System.currentTimeMillis();
    this.aKY += 1;
  }
  
  private void oo()
  {
    g localg1 = r.U(this.mContext).o(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1) })));
    g localg2 = r.U(this.mContext).o(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(2) })));
    g localg3 = r.U(this.mContext).o(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(4) })));
    if ((s.b(localg1, localg2)) && (s.b(localg1, localg3))) {
      return;
    }
    localg1 = s.a(s.a(localg1, localg2), s.a(localg1, localg3));
    new StringBuilder("local mid check failed, redress with mid:").append(localg1.toString());
    r.U(this.mContext).b(localg1);
  }
  
  public final void run()
  {
    new StringBuilder("request type:").append(this.mType);
    switch (this.mType)
    {
    default: 
      new StringBuilder("wrong type:").append(this.mType);
    }
    for (;;)
    {
      return;
      b(null);
      return;
      if (this.aKX == null) {
        this.aKX = r.U(this.mContext).oq();
      }
      long l1 = System.currentTimeMillis();
      if (i.aKO <= 0L) {
        i.aKO = PreferenceManager.getDefaultSharedPreferences(this.mContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
      }
      long l2 = Math.abs(l1 - i.aKO);
      new StringBuilder("check entity: ").append(this.aKX.toString()).append(",duration:").append(l2);
      if ((this.aKX.aKo < 0) || (this.aKX.aKo > 100)) {
        this.aKX.aKo = 3;
      }
      long l3 = this.aKX.aKo * e.aKI;
      new StringBuilder("duration:").append(l2).append(",maxCheckDays:").append(l3).append(",mLastCheckTime:").append(i.aKO).append(",mCheckEntity:").append(this.aKX);
      if (l2 < l3)
      {
        if (l2 <= e.aKI) {
          continue;
        }
        oo();
        return;
      }
      oo();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("dur", l2);
        localJSONObject.put("md", l3);
        localJSONObject.put("lct", i.aKO);
        localJSONObject.put("cur", l1);
        if (aKZ > 0L) {
          continue;
        }
        b(localJSONObject);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */