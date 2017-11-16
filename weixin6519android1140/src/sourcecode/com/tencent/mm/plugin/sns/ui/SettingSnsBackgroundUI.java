package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.a;
import java.util.LinkedList;
import java.util.List;

public class SettingSnsBackgroundUI
  extends MMPreference
{
  protected String filePath;
  private SharedPreferences ghC;
  private f htU;
  
  public SettingSnsBackgroundUI()
  {
    GMTrace.i(8670599446528L, 64601);
    GMTrace.o(8670599446528L, 64601);
  }
  
  private void ahJ()
  {
    GMTrace.i(8671941623808L, 64611);
    if (!com.tencent.mm.pluginsdk.ui.tools.k.c(this, com.tencent.mm.compatible.util.e.fRZ, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
      Toast.makeText(this, getString(i.j.dWY), 1).show();
    }
    GMTrace.o(8671941623808L, 64611);
  }
  
  private void b(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8671404752896L, 64607);
    switch (paramInt)
    {
    case 3: 
    case 4: 
    default: 
      w.e("MicroMsg.SettingSnsBackgroundUI", "onActivityResult: not found this requestCode");
      GMTrace.o(8671404752896L, 64607);
      return;
    case 2: 
      w.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_TAKE_PICTURE");
      this.filePath = com.tencent.mm.pluginsdk.ui.tools.k.b(getApplicationContext(), paramIntent, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath());
      if (this.filePath == null)
      {
        GMTrace.o(8671404752896L, 64607);
        return;
      }
      paramIntent = new Intent();
      paramIntent.putExtra("CropImageMode", 1);
      paramIntent.putExtra("CropImage_ImgPath", this.filePath);
      localObject1 = g.n((this.filePath + System.currentTimeMillis()).getBytes());
      paramIntent.putExtra("CropImage_OutputPath", com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + (String)localObject1);
      com.tencent.mm.plugin.sns.c.a.hnH.a(this, paramIntent, 6);
      GMTrace.o(8671404752896L, 64607);
      return;
    case 5: 
      w.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult CONTEXT_MENU_IMAGE_BROUND");
      if (paramIntent == null)
      {
        GMTrace.o(8671404752896L, 64607);
        return;
      }
      this.filePath = com.tencent.mm.pluginsdk.ui.tools.k.b(getApplicationContext(), paramIntent, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath());
      if (this.filePath == null)
      {
        GMTrace.o(8671404752896L, 64607);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 1);
      ((Intent)localObject1).putExtra("CropImage_ImgPath", this.filePath);
      com.tencent.mm.plugin.sns.c.a.hnH.a(this, paramIntent, (Intent)localObject1, com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath(), 6, new a.a()
      {
        public final String Jb(String paramAnonymousString)
        {
          GMTrace.i(8515846406144L, 63448);
          paramAnonymousString = g.n((SettingSnsBackgroundUI.this.filePath + System.currentTimeMillis()).getBytes());
          paramAnonymousString = com.tencent.mm.plugin.sns.model.ae.getAccSnsTmpPath() + paramAnonymousString;
          GMTrace.o(8515846406144L, 63448);
          return paramAnonymousString;
        }
      });
      GMTrace.o(8671404752896L, 64607);
      return;
    }
    w.d("MicroMsg.SettingSnsBackgroundUI", "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
    new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8509806608384L, 63403);
        com.tencent.mm.plugin.sns.c.a.hnI.pt();
        GMTrace.o(8509806608384L, 63403);
      }
    });
    if (paramIntent == null)
    {
      GMTrace.o(8671404752896L, 64607);
      return;
    }
    this.filePath = paramIntent.getStringExtra("CropImage_OutputPath");
    if (this.filePath == null)
    {
      GMTrace.o(8671404752896L, 64607);
      return;
    }
    w.d("MicroMsg.SettingSnsBackgroundUI", "REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM   " + this.filePath);
    Object localObject1 = com.tencent.mm.plugin.sns.model.ae.biZ();
    paramIntent = this.filePath;
    new LinkedList().add(new com.tencent.mm.plugin.sns.data.h(paramIntent, 2));
    if ((((av)localObject1).biJ() != null) && (!((av)localObject1).biJ().equals("")))
    {
      Object localObject2 = am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((av)localObject1).biJ());
      FileOp.la((String)localObject2);
      FileOp.deleteFile((String)localObject2 + ((av)localObject1).biJ() + "bg_");
      FileOp.o(paramIntent, (String)localObject2 + ((av)localObject1).biJ() + "bg_");
      localObject2 = com.tencent.mm.plugin.sns.model.ae.bjh();
      com.tencent.mm.plugin.sns.storage.k localk = ((com.tencent.mm.plugin.sns.storage.l)localObject2).Iw(((av)localObject1).biJ());
      localk.field_bgId = "";
      ((com.tencent.mm.plugin.sns.storage.l)localObject2).c(localk);
    }
    ((av)localObject1).bjM();
    ((av)localObject1).biJ();
    localObject1 = new aw(7);
    ((aw)localObject1).dI(paramIntent, "");
    ((aw)localObject1).uB(1);
    ((aw)localObject1).commit();
    setResult(-1);
    finish();
    GMTrace.o(8671404752896L, 64607);
  }
  
  protected final void MP()
  {
    GMTrace.i(8671673188352L, 64609);
    oM(i.j.pik);
    SnsArtistPreference localSnsArtistPreference = (SnsArtistPreference)this.htU.VG("settings_sns_bg_select_bg");
    if (localSnsArtistPreference != null)
    {
      String str = this.ghC.getString("artist_name", "");
      w.d("MicroMsg.SettingSnsBackgroundUI", "artistName" + str);
      localSnsArtistPreference.pXX = str;
      localSnsArtistPreference.bos();
      this.htU.notifyDataSetChanged();
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8324049272832L, 62019);
        SettingSnsBackgroundUI.this.finish();
        GMTrace.o(8324049272832L, 62019);
        return true;
      }
    });
    GMTrace.o(8671673188352L, 64609);
  }
  
  public final int QI()
  {
    GMTrace.i(8670733664256L, 64602);
    int i = i.m.plI;
    GMTrace.o(8670733664256L, 64602);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(8671807406080L, 64610);
    paramf = paramPreference.hiu;
    w.i("MicroMsg.SettingSnsBackgroundUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_sns_bg_select_from_album"))
    {
      com.tencent.mm.kernel.h.xz();
      if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
      {
        u.fo(this);
        GMTrace.o(8671807406080L, 64610);
        return false;
      }
      com.tencent.mm.pluginsdk.ui.tools.k.a(this, 5, null);
      GMTrace.o(8671807406080L, 64610);
      return true;
    }
    if (paramf.equals("settings_sns_bg_take_photo"))
    {
      com.tencent.mm.kernel.h.xz();
      if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
      {
        u.fo(this);
        GMTrace.o(8671807406080L, 64610);
        return false;
      }
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this.vKB.vKW, "android.permission.CAMERA", 16, "", "");
      w.i("MicroMsg.SettingSnsBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this.vKB.vKW });
      if (!bool)
      {
        GMTrace.o(8671807406080L, 64610);
        return false;
      }
      ahJ();
      GMTrace.o(8671807406080L, 64610);
      return true;
    }
    if (paramf.equals("settings_sns_bg_select_bg"))
    {
      startActivity(new Intent(this, ArtistUI.class));
      GMTrace.o(8671807406080L, 64610);
      return true;
    }
    GMTrace.o(8671807406080L, 64610);
    return false;
  }
  
  protected void onActivityResult(final int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(8671538970624L, 64608);
    w.i("MicroMsg.SettingSnsBackgroundUI", "onAcvityResult requestCode:" + paramInt1 + " " + paramInt2);
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 2) || (paramInt1 == 5) || (paramInt1 == 6)) {
        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8585505406976L, 63967);
            com.tencent.mm.plugin.sns.c.a.hnI.pt();
            GMTrace.o(8585505406976L, 63967);
          }
        });
      }
      GMTrace.o(8671538970624L, 64608);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("result ok ");
    com.tencent.mm.kernel.h.xz();
    w.d("MicroMsg.SettingSnsBackgroundUI", com.tencent.mm.kernel.h.xw().wL());
    if (com.tencent.mm.plugin.sns.model.ae.biM())
    {
      new com.tencent.mm.sdk.platformtools.ae(Looper.myLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8537723895808L, 63611);
          SettingSnsBackgroundUI.a(SettingSnsBackgroundUI.this, paramInt1, paramIntent);
          GMTrace.o(8537723895808L, 63611);
        }
      }, 2000L);
      GMTrace.o(8671538970624L, 64608);
      return;
    }
    w.d("MicroMsg.SettingSnsBackgroundUI", "isInValid ok");
    b(paramInt1, paramIntent);
    GMTrace.o(8671538970624L, 64608);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8670867881984L, 64603);
    w.d("MicroMsg.SettingSnsBackgroundUI", "onCreate");
    super.onCreate(paramBundle);
    this.htU = this.wky;
    this.ghC = getSharedPreferences(ab.bPU(), 0);
    MP();
    GMTrace.o(8670867881984L, 64603);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8671136317440L, 64605);
    super.onDestroy();
    w.d("MicroMsg.SettingSnsBackgroundUI", "onDestroy");
    GMTrace.o(8671136317440L, 64605);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(8671002099712L, 64604);
    w.d("MicroMsg.SettingSnsBackgroundUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    setResult(-1);
    finish();
    GMTrace.o(8671002099712L, 64604);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(8672075841536L, 64612);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      w.i("MicroMsg.SettingSnsBackgroundUI", "summerper onRequestPermissionsResult grantResults[%s] invalid", new Object[] { paramArrayOfInt });
      GMTrace.o(8672075841536L, 64612);
      return;
    }
    w.i("MicroMsg.SettingSnsBackgroundUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(8672075841536L, 64612);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        ahJ();
        GMTrace.o(8672075841536L, 64612);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(i.j.dNn), getString(i.j.dNu), getString(i.j.dFX), getString(i.j.cSk), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8335726215168L, 62106);
          SettingSnsBackgroundUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(8335726215168L, 62106);
        }
      }, null);
    }
  }
  
  public void onResume()
  {
    GMTrace.i(8671270535168L, 64606);
    super.onResume();
    if (this.htU != null) {
      this.htU.notifyDataSetChanged();
    }
    GMTrace.o(8671270535168L, 64606);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SettingSnsBackgroundUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */