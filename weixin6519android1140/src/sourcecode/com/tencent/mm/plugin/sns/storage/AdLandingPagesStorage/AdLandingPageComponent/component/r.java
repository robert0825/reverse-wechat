package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONObject;

public final class r
  extends k
{
  public r(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k paramk, ViewGroup paramViewGroup)
  {
    super(paramContext, paramk, paramViewGroup);
    GMTrace.i(18579894304768L, 138431);
    GMTrace.o(18579894304768L, 138431);
  }
  
  private boolean ctP()
  {
    GMTrace.i(21066546151424L, 156958);
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)bkQ()).yvk == 1)
    {
      GMTrace.o(21066546151424L, 156958);
      return true;
    }
    GMTrace.o(21066546151424L, 156958);
    return false;
  }
  
  private boolean ctQ()
  {
    GMTrace.i(21066680369152L, 156959);
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)bkQ()).yvl == 1)
    {
      GMTrace.o(21066680369152L, 156959);
      return true;
    }
    GMTrace.o(21066680369152L, 156959);
    return false;
  }
  
  public final void bT(Context paramContext, String paramString)
  {
    GMTrace.i(21066411933696L, 156957);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    localIntent.putExtra("sns_landig_pages_origin_from_source", bkQ().pEM);
    localIntent.putExtra("sns_landing_pages_xml", "");
    String str3;
    String str1;
    String str2;
    JSONObject localJSONObject;
    if (ctQ())
    {
      localIntent.putExtra("sns_landing_pages_canvasid", paramString);
      if (ctP())
      {
        paramString = new int[2];
        this.pGX.getLocationOnScreen(paramString);
        localIntent.putExtra("img_gallery_top", paramString[1]);
        localIntent.putExtra("img_gallery_left", paramString[0]);
        localIntent.putExtra("img_gallery_width", this.pGX.getWidth());
        localIntent.putExtra("img_gallery_height", this.pGX.getHeight());
      }
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", ctP());
      localIntent.putExtra("sns_landing_pages_extra", "");
      localIntent.putExtra("sns_landing_pages_no_store", 0);
      localIntent.putExtra("sns_landing_pages_ux_info", bkQ().pyc);
      localIntent.putExtra("sns_landing_is_native_sight_ad", bkQ().pEN);
      if (((paramContext instanceof Activity)) && (ctQ()))
      {
        str3 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_sessionId");
        str1 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bg.nm(str3))
        {
          str2 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
    }
    for (;;)
    {
      try
      {
        localJSONObject.put("sessionId", str2);
        localJSONObject.put("cid", bkQ().pEz);
        if (bg.nm(str1)) {
          continue;
        }
        paramString = str1;
        localJSONObject.put("adBuffer", paramString);
        localJSONObject.put("preSessionId", str3);
      }
      catch (Exception paramString)
      {
        continue;
      }
      localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
      localIntent.putExtra("sns_landing_pages_sessionId", str2);
      localIntent.putExtra("sns_landing_pages_ad_buffer", str1);
      d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
      GMTrace.o(21066411933696L, 156957);
      return;
      localIntent.putExtra("sns_landing_pages_pageid", bg.Sz(paramString));
      break;
      paramString = "";
    }
  }
  
  protected final void d(Button paramButton)
  {
    GMTrace.i(18580028522496L, 138432);
    paramButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18579088998400L, 138425);
        r.this.bkP();
        paramAnonymousView = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k)r.this.bkQ();
        r.this.bT(r.this.context, paramAnonymousView.pEw);
        GMTrace.o(18579088998400L, 138425);
      }
    });
    GMTrace.o(18580028522496L, 138432);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */