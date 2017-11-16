package com.tencent.mm.plugin.clean.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import org.json.JSONException;
import org.json.JSONObject;

@a(19)
public class CleanUI
  extends MMActivity
{
  private long jTC;
  private String jTD;
  private String jTE;
  private String jTF;
  private JSONObject jTG;
  
  public CleanUI()
  {
    GMTrace.i(7053410041856L, 52552);
    this.jTD = "com.tencent.qqpimsecure";
    this.jTE = "00B1208638DE0FCD3E920886D658DAF6";
    this.jTF = "11206657";
    GMTrace.o(7053410041856L, 52552);
  }
  
  private boolean aok()
  {
    GMTrace.i(7053812695040L, 52555);
    aol();
    if (!com.tencent.mm.pluginsdk.model.app.p.n(this.vKB.vKW, this.jTD))
    {
      GMTrace.o(7053812695040L, 52555);
      return false;
    }
    Object localObject = com.tencent.mm.pluginsdk.model.app.p.aQ(this, this.jTD);
    if ((localObject != null) && (localObject[0] != null))
    {
      localObject = com.tencent.mm.a.g.n(localObject[0].toByteArray());
      if ((localObject != null) && (((String)localObject).equalsIgnoreCase(this.jTE))) {
        try
        {
          localObject = getPackageManager().getLaunchIntentForPackage(this.jTD);
          if (localObject != null)
          {
            Bundle localBundle = new Bundle();
            com.tencent.mm.pluginsdk.model.app.p.g(localBundle, this.jTF);
            ((Intent)localObject).putExtras(localBundle);
            ((Intent)localObject).addFlags(268435456);
            startActivity((Intent)localObject);
            com.tencent.mm.plugin.report.service.g.ork.a(282L, 6L, 1L, false);
            GMTrace.o(7053812695040L, 52555);
            return true;
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.CleanUI", localException, "", new Object[0]);
          GMTrace.o(7053812695040L, 52555);
          return true;
        }
      }
    }
    GMTrace.o(7053812695040L, 52555);
    return false;
  }
  
  private boolean aol()
  {
    GMTrace.i(7053678477312L, 52554);
    at.AR();
    String str = (String)c.xh().get(w.a.vto, "");
    if (bg.nm(str))
    {
      GMTrace.o(7053678477312L, 52554);
      return false;
    }
    try
    {
      this.jTG = new JSONObject(str);
      this.jTD = this.jTG.getString("packageName");
      this.jTG.get("md5");
      this.jTF = this.jTG.getString("launcherID");
      this.jTE = this.jTG.getString("signature");
      this.jTG.get("url");
      this.jTC = this.jTG.getLong("size");
      GMTrace.o(7053678477312L, 52554);
      return true;
    }
    catch (JSONException localJSONException)
    {
      w.printErrStackTrace("MicroMsg.CleanUI", localJSONException, "", new Object[0]);
      GMTrace.o(7053678477312L, 52554);
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7053946912768L, 52556);
    int i = R.i.ctv;
    GMTrace.o(7053946912768L, 52556);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7053544259584L, 52553);
    super.onCreate(paramBundle);
    if ((getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) && (aok()))
    {
      finish();
      GMTrace.o(7053544259584L, 52553);
      return;
    }
    startActivity(new Intent(this, CleanNewUI.class));
    finish();
    GMTrace.o(7053544259584L, 52553);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\clean\ui\CleanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */