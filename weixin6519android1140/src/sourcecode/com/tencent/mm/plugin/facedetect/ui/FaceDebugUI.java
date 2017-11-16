package com.tencent.mm.plugin.facedetect.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.facedetect.a.b;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.a.i;
import com.tencent.mm.plugin.facedetect.model.e;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import java.io.File;

public class FaceDebugUI
  extends MMPreference
{
  private f htU;
  private CheckBoxPreference kVd;
  private CheckBoxPreference kVe;
  private CheckBoxPreference kVf;
  private CheckBoxPreference kVg;
  private CheckBoxPreference kVh;
  private CheckBoxPreference kVi;
  private View koX;
  
  public FaceDebugUI()
  {
    GMTrace.i(5878736486400L, 43800);
    this.kVd = null;
    this.kVe = null;
    this.kVf = null;
    this.kVg = null;
    this.kVh = null;
    this.kVi = null;
    GMTrace.o(5878736486400L, 43800);
  }
  
  private void awM()
  {
    GMTrace.i(5879004921856L, 43802);
    this.htU = this.wky;
    this.kVd = ((CheckBoxPreference)this.htU.VG("face_debug_switch"));
    this.kVe = ((CheckBoxPreference)this.htU.VG("face_debug_save_pic_switch"));
    this.kVf = ((CheckBoxPreference)this.htU.VG("face_debug_save_final_switch"));
    this.kVg = ((CheckBoxPreference)this.htU.VG("face_debug_save_lipreading_switch"));
    this.kVh = ((CheckBoxPreference)this.htU.VG("face_debug_save_voice_switch"));
    this.kVi = ((CheckBoxPreference)this.htU.VG("face_debug_force_upload_video"));
    this.htU.notifyDataSetChanged();
    GMTrace.o(5879004921856L, 43802);
  }
  
  private void awN()
  {
    GMTrace.i(5879407575040L, 43805);
    boolean bool1 = e.awc();
    boolean bool2 = e.awe();
    boolean bool3 = e.awf();
    boolean bool4 = e.awg();
    boolean bool5 = e.awh();
    boolean bool6 = e.awd();
    if (!bool1)
    {
      this.kVd.lN(false);
      this.htU.bc("face_debug_save_pic_switch", true);
      this.htU.bc("face_debug_save_final_switch", true);
      this.htU.bc("face_debug_save_lipreading_switch", true);
      this.htU.bc("face_debug_save_voice_switch", true);
      this.htU.bc("face_debug_force_upload_video", true);
    }
    for (;;)
    {
      this.htU.notifyDataSetChanged();
      GMTrace.o(5879407575040L, 43805);
      return;
      this.kVd.lN(true);
      this.htU.bc("face_debug_save_pic_switch", false);
      this.htU.bc("face_debug_save_final_switch", false);
      this.htU.bc("face_debug_save_lipreading_switch", false);
      this.htU.bc("face_debug_save_voice_switch", false);
      this.htU.bc("face_debug_force_upload_video", false);
      this.kVe.lN(bool2);
      this.kVf.lN(bool3);
      this.kVg.lN(bool4);
      this.kVh.lN(bool5);
      this.kVi.lN(bool6);
    }
  }
  
  public final int QI()
  {
    GMTrace.i(5879541792768L, 43806);
    int i = a.i.kRm;
    GMTrace.o(5879541792768L, 43806);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(5879676010496L, 43807);
    awM();
    if ("face_debug_switch".equals(paramPreference.hiu))
    {
      e.ei(this.kVd.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_save_pic_switch".equals(paramPreference.hiu))
    {
      e.ej(this.kVe.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_save_final_switch".equals(paramPreference.hiu))
    {
      e.ek(this.kVf.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_save_lipreading_switch".equals(paramPreference.hiu))
    {
      e.el(this.kVg.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_save_voice_switch".equals(paramPreference.hiu))
    {
      e.em(this.kVh.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_force_upload_video".equals(paramPreference.hiu))
    {
      e.en(this.kVi.isChecked());
      awN();
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_clear_resource".equals(paramPreference.hiu))
    {
      paramf = new File(n.nt(0));
      if (paramf.exists()) {
        paramf.delete();
      }
      paramf = new File(n.nt(1));
      if (paramf.exists()) {
        paramf.delete();
      }
      as.gnb.M("LAST_LOGIN_FACE_MODEL_DETECT_VERSION", "-1");
      as.gnb.M("LAST_LOGIN_FACE_MODEL_ALIGNMENT_VERSION", "-1");
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    if ("face_debug_check_resource".equals(paramPreference.hiu))
    {
      paramf = new File(n.nt(0));
      paramPreference = new File(n.nt(1));
      u.makeText(this.vKB.vKW, String.format("is detect model exists: %b, is alignment model exists: %b", new Object[] { Boolean.valueOf(paramf.exists()), Boolean.valueOf(paramPreference.exists()) }), 0).show();
      w.i("MicroMsg.FaceDebugUI", "hy: detect bin md5: %s", new Object[] { g.h(paramf) });
      w.i("MicroMsg.FaceDebugUI", "hy: alignment bin md5: %s", new Object[] { g.h(paramPreference) });
      GMTrace.o(5879676010496L, 43807);
      return true;
    }
    GMTrace.o(5879676010496L, 43807);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5878870704128L, 43801);
    super.onCreate(paramBundle);
    this.koX = findViewById(a.e.bNs);
    this.koX.setBackgroundResource(a.b.white);
    awM();
    sq(getString(a.h.kQA));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5898332274688L, 43946);
        FaceDebugUI.this.finish();
        GMTrace.o(5898332274688L, 43946);
        return false;
      }
    });
    GMTrace.o(5878870704128L, 43801);
  }
  
  protected void onResume()
  {
    GMTrace.i(5879139139584L, 43803);
    super.onResume();
    awN();
    GMTrace.o(5879139139584L, 43803);
  }
  
  protected void onStop()
  {
    GMTrace.i(5879273357312L, 43804);
    super.onStop();
    GMTrace.o(5879273357312L, 43804);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\FaceDebugUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */