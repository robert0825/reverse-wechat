package com.tencent.mm.plugin.webview.fts.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends a
{
  private String eVH;
  private int x;
  private int y;
  
  public b(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(19468952535040L, 145055);
    this.x = paramInt1;
    this.y = paramInt2;
    this.eVH = paramString;
    GMTrace.o(19468952535040L, 145055);
  }
  
  public final String bBO()
  {
    GMTrace.i(19469220970496L, 145057);
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("x", this.x);
      ((JSONObject)localObject).put("y", this.y);
      ((JSONObject)localObject).put("eventId", this.eVH);
      localObject = ((JSONObject)localObject).toString();
      GMTrace.o(19469220970496L, 145057);
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        w.printErrStackTrace("onTap", localJSONException, "", new Object[0]);
      }
    }
  }
  
  public final String getName()
  {
    GMTrace.i(19469086752768L, 145056);
    GMTrace.o(19469086752768L, 145056);
    return "onTap";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */