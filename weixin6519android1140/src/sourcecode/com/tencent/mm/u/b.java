package com.tencent.mm.u;

import android.annotation.TargetApi;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements a
{
  private JSONArray fXK;
  
  public b()
  {
    GMTrace.i(20789789196288L, 154896);
    this.fXK = new JSONArray();
    GMTrace.o(20789789196288L, 154896);
  }
  
  b(JSONArray paramJSONArray)
  {
    GMTrace.i(20789923414016L, 154897);
    Assert.assertNotNull(paramJSONArray);
    this.fXK = paramJSONArray;
    GMTrace.o(20789923414016L, 154897);
  }
  
  public final a M(long paramLong)
  {
    GMTrace.i(20790594502656L, 154902);
    this.fXK.put(paramLong);
    GMTrace.o(20790594502656L, 154902);
    return this;
  }
  
  public final a aq(Object paramObject)
  {
    GMTrace.i(20790728720384L, 154903);
    this.fXK.put(paramObject);
    GMTrace.o(20790728720384L, 154903);
    return this;
  }
  
  public final a ba(boolean paramBoolean)
  {
    GMTrace.i(20790191849472L, 154899);
    this.fXK.put(paramBoolean);
    GMTrace.o(20790191849472L, 154899);
    return this;
  }
  
  public final a eT(int paramInt)
  {
    GMTrace.i(20790460284928L, 154901);
    this.fXK.put(paramInt);
    GMTrace.o(20790460284928L, 154901);
    return this;
  }
  
  public final a eU(int paramInt)
  {
    GMTrace.i(20793413074944L, 154923);
    try
    {
      Object localObject = this.fXK.getJSONArray(paramInt);
      if (localObject == null)
      {
        GMTrace.o(20793413074944L, 154923);
        return null;
      }
      localObject = new b((JSONArray)localObject);
      GMTrace.o(20793413074944L, 154923);
      return (a)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final a eV(int paramInt)
  {
    GMTrace.i(20793547292672L, 154924);
    Object localObject = this.fXK.optJSONArray(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20793547292672L, 154924);
      return null;
    }
    localObject = new b((JSONArray)localObject);
    GMTrace.o(20793547292672L, 154924);
    return (a)localObject;
  }
  
  public final c eW(int paramInt)
  {
    GMTrace.i(20793681510400L, 154925);
    try
    {
      Object localObject = this.fXK.getJSONObject(paramInt);
      if (localObject == null)
      {
        GMTrace.o(20793681510400L, 154925);
        return null;
      }
      localObject = new d((JSONObject)localObject);
      GMTrace.o(20793681510400L, 154925);
      return (c)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final c eX(int paramInt)
  {
    GMTrace.i(20793815728128L, 154926);
    Object localObject = this.fXK.optJSONObject(paramInt);
    if (localObject == null)
    {
      GMTrace.o(20793815728128L, 154926);
      return null;
    }
    localObject = new d((JSONObject)localObject);
    GMTrace.o(20793815728128L, 154926);
    return (c)localObject;
  }
  
  public final a g(double paramDouble)
  {
    GMTrace.i(20790326067200L, 154900);
    try
    {
      this.fXK.put(paramDouble);
      GMTrace.o(20790326067200L, 154900);
      return this;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(20790997155840L, 154905);
    try
    {
      Object localObject = this.fXK.get(paramInt);
      if ((localObject instanceof JSONObject))
      {
        localObject = new d((JSONObject)localObject);
        GMTrace.o(20790997155840L, 154905);
        return localObject;
      }
      if ((localObject instanceof JSONArray))
      {
        localObject = new b((JSONArray)localObject);
        GMTrace.o(20790997155840L, 154905);
        return localObject;
      }
      GMTrace.o(20790997155840L, 154905);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(20791399809024L, 154908);
    try
    {
      boolean bool = this.fXK.getBoolean(paramInt);
      GMTrace.o(20791399809024L, 154908);
      return bool;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(20791802462208L, 154911);
    try
    {
      double d = this.fXK.getDouble(paramInt);
      GMTrace.o(20791802462208L, 154911);
      return d;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(20792205115392L, 154914);
    try
    {
      paramInt = this.fXK.getInt(paramInt);
      GMTrace.o(20792205115392L, 154914);
      return paramInt;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(20792607768576L, 154917);
    try
    {
      long l = this.fXK.getLong(paramInt);
      GMTrace.o(20792607768576L, 154917);
      return l;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(20793010421760L, 154920);
    try
    {
      String str = this.fXK.getString(paramInt);
      GMTrace.o(20793010421760L, 154920);
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(20790862938112L, 154904);
    boolean bool = this.fXK.isNull(paramInt);
    GMTrace.o(20790862938112L, 154904);
    return bool;
  }
  
  public final int length()
  {
    GMTrace.i(20790057631744L, 154898);
    int i = this.fXK.length();
    GMTrace.o(20790057631744L, 154898);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(20791131373568L, 154906);
    Object localObject = this.fXK.opt(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      GMTrace.o(20791131373568L, 154906);
      return localObject;
    }
    if ((localObject instanceof JSONArray))
    {
      localObject = new b((JSONArray)localObject);
      GMTrace.o(20791131373568L, 154906);
      return localObject;
    }
    GMTrace.o(20791131373568L, 154906);
    return localObject;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(20791534026752L, 154909);
    boolean bool = this.fXK.optBoolean(paramInt);
    GMTrace.o(20791534026752L, 154909);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20791668244480L, 154910);
    paramBoolean = this.fXK.optBoolean(paramInt, paramBoolean);
    GMTrace.o(20791668244480L, 154910);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(20791936679936L, 154912);
    double d = this.fXK.optDouble(paramInt);
    GMTrace.o(20791936679936L, 154912);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(20792070897664L, 154913);
    paramDouble = this.fXK.optDouble(paramInt, paramDouble);
    GMTrace.o(20792070897664L, 154913);
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(20792339333120L, 154915);
    paramInt = this.fXK.optInt(paramInt);
    GMTrace.o(20792339333120L, 154915);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(20792473550848L, 154916);
    paramInt1 = this.fXK.optInt(paramInt1, paramInt2);
    GMTrace.o(20792473550848L, 154916);
    return paramInt1;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(20792741986304L, 154918);
    long l = this.fXK.optLong(paramInt);
    GMTrace.o(20792741986304L, 154918);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(20792876204032L, 154919);
    paramLong = this.fXK.optLong(paramInt, paramLong);
    GMTrace.o(20792876204032L, 154919);
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(20793144639488L, 154921);
    String str = this.fXK.optString(paramInt);
    GMTrace.o(20793144639488L, 154921);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(20793278857216L, 154922);
    paramString = this.fXK.optString(paramInt, paramString);
    GMTrace.o(20793278857216L, 154922);
    return paramString;
  }
  
  @TargetApi(19)
  public final Object remove(int paramInt)
  {
    GMTrace.i(20791265591296L, 154907);
    Object localObject = this.fXK.remove(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      GMTrace.o(20791265591296L, 154907);
      return localObject;
    }
    if ((localObject instanceof JSONArray))
    {
      localObject = new b((JSONArray)localObject);
      GMTrace.o(20791265591296L, 154907);
      return localObject;
    }
    GMTrace.o(20791265591296L, 154907);
    return localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\u\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */