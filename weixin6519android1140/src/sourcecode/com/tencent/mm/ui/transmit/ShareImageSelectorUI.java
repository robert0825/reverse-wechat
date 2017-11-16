package com.tencent.mm.ui.transmit;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;

public class ShareImageSelectorUI
  extends MMActivity
  implements AdapterView.OnItemClickListener
{
  private static int xmf;
  private ListView Ev;
  private View kpD;
  private ImageView kve;
  private ae mHandler;
  private String mPC;
  private int wTG;
  private a xmg;
  private Dialog xmh;
  private View.OnClickListener xmi;
  
  static
  {
    GMTrace.i(3037749837824L, 22633);
    xmf = 1;
    GMTrace.o(3037749837824L, 22633);
  }
  
  public ShareImageSelectorUI()
  {
    GMTrace.i(3035065483264L, 22613);
    this.wTG = 2;
    this.xmi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3031441604608L, 22586);
        ShareImageSelectorUI.a(ShareImageSelectorUI.this);
        GMTrace.o(3031441604608L, 22586);
      }
    };
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(3055063924736L, 22762);
        ShareImageSelectorUI.this.finish();
        GMTrace.o(3055063924736L, 22762);
      }
    };
    GMTrace.o(3035065483264L, 22613);
  }
  
  private void aLd()
  {
    GMTrace.i(3036139225088L, 22621);
    h.a(this.vKB.vKW, getString(R.l.dmj), getString(R.l.dml), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3049695215616L, 22722);
        ShareImageSelectorUI.this.finish();
        GMTrace.o(3049695215616L, 22722);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(3031978475520L, 22590);
        if (ShareImageSelectorUI.aeY() == 1) {
          ShareImageSelectorUI.c(ShareImageSelectorUI.this);
        }
        GMTrace.o(3031978475520L, 22590);
      }
    });
    GMTrace.o(3036139225088L, 22621);
  }
  
  private void ciM()
  {
    GMTrace.i(3036273442816L, 22622);
    if ((this.xmh != null) && (this.xmh.isShowing()))
    {
      GMTrace.o(3036273442816L, 22622);
      return;
    }
    String str1 = getString(R.l.dmn);
    String str2 = getString(R.l.dmo);
    String str3 = getString(R.l.dmm);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    String str4 = getString(R.l.dIz);
    h.c local6 = new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(3032246910976L, 22592);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(3032246910976L, 22592);
          return;
          ShareImageSelectorUI.d(ShareImageSelectorUI.this);
          GMTrace.o(3032246910976L, 22592);
          return;
          ShareImageSelectorUI.e(ShareImageSelectorUI.this);
          GMTrace.o(3032246910976L, 22592);
          return;
          ShareImageSelectorUI.f(ShareImageSelectorUI.this);
        }
      }
    };
    DialogInterface.OnCancelListener local7 = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3016006565888L, 22471);
        ShareImageSelectorUI.b(ShareImageSelectorUI.this);
        GMTrace.o(3016006565888L, 22471);
      }
    };
    this.xmh = h.a(localActionBarActivity, str4, new String[] { str1, str2, str3 }, null, local6, local7);
    GMTrace.o(3036273442816L, 22622);
  }
  
  private void ciN()
  {
    GMTrace.i(3036407660544L, 22623);
    Intent localIntent = new Intent(this, SelectContactUI.class);
    localIntent.putExtra("list_attr", s.wTq);
    localIntent.putExtra("titile", getString(R.l.cRm));
    localIntent.putExtra("list_type", 11);
    localIntent.putExtra("shareImage", true);
    localIntent.putExtra("shareImagePath", this.mPC);
    startActivityForResult(localIntent, 1001);
    GMTrace.o(3036407660544L, 22623);
  }
  
  private void ciO()
  {
    GMTrace.i(3036541878272L, 22624);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", this.mPC);
    localIntent.putExtra("need_result", true);
    com.tencent.mm.bj.d.b(this.vKB.vKW, "sns", ".ui.En_c4f742e5", localIntent, 1002);
    GMTrace.o(3036541878272L, 22624);
  }
  
  private void ciP()
  {
    GMTrace.i(3036676096000L, 22625);
    cf localcf = new cf();
    e.a(localcf, 6, this.mPC);
    localcf.eDv.activity = this;
    localcf.eDv.eDC = 52;
    a.vgX.m(localcf);
    g.ork.i(11048, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0) });
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessageDelayed(0, 800L);
    }
    GMTrace.o(3036676096000L, 22625);
  }
  
  protected final int Qf()
  {
    GMTrace.i(3035468136448L, 22616);
    GMTrace.o(3035468136448L, 22616);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3035199700992L, 22614);
    int i = R.i.cGv;
    GMTrace.o(3035199700992L, 22614);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3035870789632L, 22619);
    w.d("MicroMsg.ShareImageSelectorUI", "requestCode:%d , resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      w.w("MicroMsg.ShareImageSelectorUI", "unknow result");
      GMTrace.o(3035870789632L, 22619);
      return;
    case 1001: 
      if (paramInt2 == -1)
      {
        ArrayList localArrayList = null;
        if (paramIntent != null) {
          localArrayList = paramIntent.getStringArrayListExtra("Select_Contact");
        }
        if ((localArrayList != null) && (localArrayList.size() == 1))
        {
          paramIntent = new Intent(this, En_5b8fbb1e.class);
          paramIntent.putExtra("Chat_User", (String)localArrayList.get(0));
          startActivity(paramIntent);
        }
        finish();
        GMTrace.o(3035870789632L, 22619);
        return;
      }
      w.w("MicroMsg.ShareImageSelectorUI", "user cancle");
      GMTrace.o(3035870789632L, 22619);
      return;
    }
    if (paramInt2 == -1)
    {
      Toast.makeText(this.vKB.vKW, R.l.div, 0).show();
      finish();
      GMTrace.o(3035870789632L, 22619);
      return;
    }
    w.w("MicroMsg.ShareImageSelectorUI", "user cancle");
    GMTrace.o(3035870789632L, 22619);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(3036005007360L, 22620);
    aLd();
    GMTrace.o(3036005007360L, 22620);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3035333918720L, 22615);
    super.onCreate(paramBundle);
    at.AR();
    paramBundle = c.xh().get(229635, null);
    if ((paramBundle instanceof Integer))
    {
      i = ((Integer)paramBundle).intValue();
      if ((i == 0) || (i == 1)) {
        xmf = i;
      }
    }
    oM(R.l.dIz);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(3013590646784L, 22453);
        ShareImageSelectorUI.b(ShareImageSelectorUI.this);
        GMTrace.o(3013590646784L, 22453);
        return false;
      }
    });
    this.wTG = getIntent().getIntExtra("Select_Conv_Type", 2);
    this.mPC = getIntent().getStringExtra("intent_extra_image_path");
    this.kpD = findViewById(R.h.bLO);
    this.kve = ((ImageView)findViewById(R.h.image));
    this.kve.setOnClickListener(this.xmi);
    this.Ev = ((ListView)findViewById(R.h.list));
    this.xmg = new a();
    this.Ev.setAdapter(this.xmg);
    this.Ev.setOnItemClickListener(this);
    w.d("MicroMsg.ShareImageSelectorUI", "mSelectType:%s ImagePath:%s", new Object[] { this.wTG, this.mPC });
    if (xmf == 1)
    {
      AU(8);
      this.Ev.setVisibility(8);
      this.kve.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.kve.setPadding(0, 0, 0, 0);
      this.kve.setOnClickListener(null);
      this.kpD.setBackgroundColor(getResources().getColor(R.e.aNp));
      ciM();
    }
    long l = System.currentTimeMillis();
    paramBundle = j.nf(this.mPC);
    int i = BackwardSupportUtil.ExifHelper.Rz(this.mPC);
    w.d("MicroMsg.ShareImageSelectorUI", "cpan [onCreate]degree:%d", new Object[] { Integer.valueOf(i) });
    paramBundle = com.tencent.mm.sdk.platformtools.d.b(paramBundle, i);
    if ((paramBundle != null) && (!paramBundle.isRecycled())) {
      this.kve.setImageBitmap(paramBundle);
    }
    w.d("MicroMsg.ShareImageSelectorUI", "cpan[onCreate] Read Bitmap Time:%s", new Object[] { System.currentTimeMillis() - l + "'" });
    GMTrace.o(3035333918720L, 22615);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(3035736571904L, 22618);
    switch (paramInt)
    {
    default: 
      w.e("MicroMsg.ShareImageSelectorUI", "unknow postion.");
      GMTrace.o(3035736571904L, 22618);
      return;
    case 0: 
      ciN();
      GMTrace.o(3035736571904L, 22618);
      return;
    case 1: 
      ciO();
      GMTrace.o(3035736571904L, 22618);
      return;
    }
    ciP();
    GMTrace.o(3035736571904L, 22618);
  }
  
  protected void onResume()
  {
    GMTrace.i(3035602354176L, 22617);
    super.onResume();
    if ((xmf == 1) && ((this.xmh == null) || (!this.xmh.isShowing()))) {
      ciM();
    }
    GMTrace.o(3035602354176L, 22617);
  }
  
  final class a
    extends BaseAdapter
  {
    public a[] xmk;
    
    a()
    {
      GMTrace.i(3030636298240L, 22580);
      this.xmk = new a[] { new a(R.l.dmn, R.k.cOJ), new a(R.l.dmo, R.k.cMB), new a(R.l.dmm, R.k.cMZ) };
      GMTrace.o(3030636298240L, 22580);
    }
    
    public final int getCount()
    {
      GMTrace.i(3030770515968L, 22581);
      GMTrace.o(3030770515968L, 22581);
      return 3;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(3030904733696L, 22582);
      long l = paramInt;
      GMTrace.o(3030904733696L, 22582);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(3031038951424L, 22583);
      if ((paramView == null) || (paramView.getTag() == null)) {
        paramView = LayoutInflater.from(ShareImageSelectorUI.this.vKB.vKW).inflate(R.i.cGw, null);
      }
      for (paramViewGroup = new ShareImageSelectorUI.b(ShareImageSelectorUI.this, paramView);; paramViewGroup = (ShareImageSelectorUI.b)paramView.getTag())
      {
        a locala = this.xmk[paramInt];
        if (locala != null)
        {
          paramViewGroup.xmo.setText(locala.xml);
          paramViewGroup.lhJ.setImageResource(locala.xmm);
        }
        GMTrace.o(3031038951424L, 22583);
        return paramView;
      }
    }
    
    final class a
    {
      int xml;
      int xmm;
      
      public a(int paramInt1, int paramInt2)
      {
        GMTrace.i(3053721747456L, 22752);
        this.xml = paramInt1;
        this.xmm = paramInt2;
        GMTrace.o(3053721747456L, 22752);
      }
    }
  }
  
  final class b
  {
    MMImageView lhJ;
    TextView xmo;
    
    public b(View paramView)
    {
      GMTrace.i(3032381128704L, 22593);
      this.lhJ = ((MMImageView)paramView.findViewById(R.h.bIL));
      this.xmo = ((TextView)paramView.findViewById(R.h.bJa));
      GMTrace.o(3032381128704L, 22593);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\transmit\ShareImageSelectorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */