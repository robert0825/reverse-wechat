package com.tencent.mm.plugin.setting.ui.setting;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ge;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.setting.ui.widget.FontSelectorView;
import com.tencent.mm.plugin.setting.ui.widget.FontSelectorView.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.q;

public class SettingsFontUI
  extends MMActivity
{
  private int oIY;
  private int oIZ;
  private int oJa;
  final float oJb;
  
  public SettingsFontUI()
  {
    GMTrace.i(4718692663296L, 35157);
    this.oIY = 0;
    this.oIZ = 2;
    this.oJa = com.tencent.mm.br.a.fromDPToPix(com.tencent.mm.sdk.platformtools.ab.getContext(), R.f.aRK);
    this.oJb = SetTextSizeUI.dd(this.vKB.vKW);
    GMTrace.o(4718692663296L, 35157);
  }
  
  private void aj(float paramFloat)
  {
    GMTrace.i(4719363751936L, 35162);
    float f = this.vKB.vKW.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getFloat("current_text_size_scale_key", 1.0F);
    w.i("MicroMsg.SettingsFontUI", "fontSizeAfter=" + f);
    if (paramFloat != f)
    {
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("Intro_Need_Clear_Top ", true);
      com.tencent.mm.plugin.setting.a.hnH.s((Intent)localObject, this.vKB.vKW);
      localObject = new ge();
      ((ge)localObject).eJm.eJn = paramFloat;
      ((ge)localObject).eJm.eJo = f;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
      localObject = new Intent();
      ((Intent)localObject).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
      com.tencent.mm.sdk.platformtools.ab.getContext().sendBroadcast((Intent)localObject);
    }
    GMTrace.o(4719363751936L, 35162);
  }
  
  protected final void MP()
  {
    GMTrace.i(4719095316480L, 35160);
    oM(R.l.eaL);
    w.i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.oJb);
    Object localObject = (ImageView)findViewById(R.h.bmV);
    final TextView localTextView1 = (TextView)findViewById(R.h.ccV);
    final TextView localTextView2 = (TextView)findViewById(R.h.ccT);
    final TextView localTextView3 = (TextView)findViewById(R.h.ccU);
    a.b.a((ImageView)localObject, q.zE());
    localObject = (FontSelectorView)findViewById(R.h.bAY);
    float f2 = SetTextSizeUI.dd(this.vKB.vKW);
    float f1;
    if (f2 >= 0.875F)
    {
      f1 = f2;
      if (f2 <= 2.025F) {}
    }
    else
    {
      f1 = 1.0F;
    }
    int i;
    if (f1 == 0.875F) {
      i = 0;
    }
    for (;;)
    {
      ((FontSelectorView)localObject).oLO = i;
      ((FontSelectorView)localObject).oLP = new FontSelectorView.a()
      {
        public final void tI(int paramAnonymousInt)
        {
          float f2 = 1.0F;
          GMTrace.i(4614808141824L, 34383);
          float f1 = f2;
          label83:
          Object localObject;
          switch (paramAnonymousInt)
          {
          default: 
            f1 = f2;
          case 1: 
            if (f1 != SettingsFontUI.this.oJb)
            {
              SettingsFontUI.a(SettingsFontUI.this, 1);
              com.tencent.mm.br.a.e(SettingsFontUI.this.vKB.vKW, f1);
              com.tencent.mm.ui.ab.e(SettingsFontUI.this.vKB.vKW, f1);
              localObject = SettingsFontUI.this.vKB.vKW.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit();
              ((SharedPreferences.Editor)localObject).putFloat("current_text_size_scale_key", f1);
              ((SharedPreferences.Editor)localObject).commit();
              SettingsFontUI.b(SettingsFontUI.this, com.tencent.mm.br.a.ea(SettingsFontUI.this.vKB.vKW));
              f2 = com.tencent.mm.br.a.dZ(SettingsFontUI.this.vKB.vKW);
              localObject = SettingsFontUI.this.vKB.vKW;
              if (f2 != 0.875F) {
                break label360;
              }
              SettingsFontUI.c(SettingsFontUI.this, com.tencent.mm.br.a.W((Context)localObject, R.f.aRL));
            }
            break;
          }
          for (;;)
          {
            localTextView1.setTextSize(1, SetTextSizeUI.ai(f1));
            localTextView2.setTextSize(1, SetTextSizeUI.ai(f1));
            localTextView3.setTextSize(1, SetTextSizeUI.ai(f1));
            SettingsFontUI localSettingsFontUI = SettingsFontUI.this;
            f1 = com.tencent.mm.br.a.W((Context)localObject, R.f.aPt);
            f2 = com.tencent.mm.br.a.eb((Context)localObject);
            localSettingsFontUI.vKB.vLd.setTextSize(0, f1 * f2);
            GMTrace.o(4614808141824L, 34383);
            return;
            f1 = 0.875F;
            break;
            f1 = 1.125F;
            break;
            f1 = 1.25F;
            break;
            f1 = 1.375F;
            break;
            f1 = 1.625F;
            break;
            f1 = 1.875F;
            break;
            f1 = 2.025F;
            break;
            SettingsFontUI.a(SettingsFontUI.this, 0);
            break label83;
            label360:
            if (f2 == 1.125F) {
              SettingsFontUI.c(SettingsFontUI.this, com.tencent.mm.br.a.W((Context)localObject, R.f.aRH));
            } else if (f2 == 1.25F) {
              SettingsFontUI.c(SettingsFontUI.this, com.tencent.mm.br.a.W((Context)localObject, R.f.aRM));
            } else if (f2 == 1.375F) {
              SettingsFontUI.c(SettingsFontUI.this, com.tencent.mm.br.a.W((Context)localObject, R.f.aRF));
            } else if ((f2 == 1.625F) || (f2 == 1.875F) || (f2 == 2.025F)) {
              SettingsFontUI.c(SettingsFontUI.this, com.tencent.mm.br.a.W((Context)localObject, R.f.aRG));
            }
          }
        }
      };
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4638430461952L, 34559);
          g.ork.i(11609, new Object[] { Integer.valueOf(SettingsFontUI.a(SettingsFontUI.this)), Integer.valueOf(SettingsFontUI.b(SettingsFontUI.this)), Integer.valueOf(0) });
          w.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", new Object[] { Integer.valueOf(11609), Integer.valueOf(SettingsFontUI.a(SettingsFontUI.this)), Integer.valueOf(SettingsFontUI.b(SettingsFontUI.this)) });
          SettingsFontUI.this.finish();
          SettingsFontUI.a(SettingsFontUI.this, SettingsFontUI.this.oJb);
          GMTrace.o(4638430461952L, 34559);
          return true;
        }
      });
      GMTrace.o(4719095316480L, 35160);
      return;
      if (f1 == 1.125F) {
        i = 2;
      } else if (f1 == 1.25F) {
        i = 3;
      } else if (f1 == 1.375F) {
        i = 4;
      } else if (f1 == 1.625F) {
        i = 5;
      } else if (f1 == 1.875F) {
        i = 6;
      } else if (f1 == 2.025F) {
        i = 7;
      } else {
        i = 1;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4718961098752L, 35159);
    int i = R.i.cGd;
    GMTrace.o(4718961098752L, 35159);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4718826881024L, 35158);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4718826881024L, 35158);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4719229534208L, 35161);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      g.ork.i(11609, new Object[] { Integer.valueOf(this.oIY), Integer.valueOf(this.oIZ), Integer.valueOf(0) });
      w.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", new Object[] { Integer.valueOf(11609), Integer.valueOf(this.oIY), Integer.valueOf(this.oIZ) });
      finish();
      aj(this.oJb);
      GMTrace.o(4719229534208L, 35161);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4719229534208L, 35161);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsFontUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */