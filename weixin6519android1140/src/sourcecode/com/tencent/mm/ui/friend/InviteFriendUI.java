package com.tencent.mm.ui.friend;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.a;
import com.tencent.mm.ui.base.p.b;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InviteFriendUI
  extends MMActivity
  implements d.a
{
  private ImageView gDc;
  private String xbG;
  private int xbH;
  private String xbI;
  private String xbJ;
  private String xbK;
  private Button xbL;
  private int xbM;
  private int xbN;
  private String xbO;
  private String xbP;
  
  public InviteFriendUI()
  {
    GMTrace.i(2817095892992L, 20989);
    this.xbO = null;
    this.xbP = null;
    GMTrace.o(2817095892992L, 20989);
  }
  
  protected final void MP()
  {
    GMTrace.i(2817901199360L, 20995);
    this.gDc = ((ImageView)findViewById(R.h.bHz));
    TextView localTextView1 = (TextView)findViewById(R.h.bHD);
    TextView localTextView3 = (TextView)findViewById(R.h.bHF);
    TextView localTextView2 = (TextView)findViewById(R.h.bHE);
    this.xbL = ((Button)findViewById(R.h.bHC));
    Button localButton = (Button)findViewById(R.h.bHG);
    localTextView1.setText(this.xbI);
    localTextView2.setText(getString(R.l.bHE, new Object[] { this.xbI }));
    Object localObject;
    if (this.xbH == 1)
    {
      this.gDc.setBackgroundDrawable(com.tencent.mm.br.a.b(this, R.k.cLS));
      localTextView3.setText(getString(R.l.cST) + this.xbG);
      localObject = com.tencent.mm.a.g.n(this.xbG.getBytes());
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        localObject = com.tencent.mm.ac.n.Dh().ba(ab.getContext());
        if (localObject == null) {
          break label592;
        }
        this.gDc.setImageBitmap((Bitmap)localObject);
      }
    }
    else
    {
      label214:
      if (this.xbH == 0)
      {
        this.gDc.setBackgroundDrawable(com.tencent.mm.br.a.b(this, R.k.cLT));
        localTextView3.setText(getString(R.l.cSV) + this.xbG);
        long l = o.bj(this.xbG);
        localObject = null;
        if (l != 0L) {
          localObject = com.tencent.mm.ac.b.X(l);
        }
        if (localObject != null) {
          break label609;
        }
        this.gDc.setImageDrawable(com.tencent.mm.br.a.b(this, R.k.cLT));
        label307:
        localButton.setVisibility(0);
      }
      if (this.xbH == 2)
      {
        this.xbL.setText(R.l.dBg);
        this.gDc.setBackgroundDrawable(com.tencent.mm.br.a.b(this, R.g.aVT));
        localTextView3.setText(getString(R.l.cSO) + this.xbG);
        at.AR();
        if (com.tencent.mm.y.c.isSDCardAvailable()) {
          break label620;
        }
        localObject = com.tencent.mm.ac.n.Dh().ba(ab.getContext());
        label397:
        if (localObject == null) {
          break label631;
        }
        this.gDc.setImageBitmap((Bitmap)localObject);
        label409:
        if (TextUtils.isEmpty(this.xbI))
        {
          localTextView1.setText(bg.SI(this.xbG));
          localTextView2.setText(getString(R.l.bHE, new Object[] { bg.SI(this.xbG) }));
        }
      }
      if (this.xbH == 3)
      {
        this.xbL.setText(R.l.dDn);
        localObject = j.a(new com.tencent.mm.pluginsdk.ui.tools.d(this.xbP, this.xbP));
        if (localObject == null) {
          break label648;
        }
        this.gDc.setImageBitmap((Bitmap)localObject);
      }
    }
    for (;;)
    {
      localButton.setVisibility(8);
      this.xbL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(2809713917952L, 20934);
          switch (InviteFriendUI.a(InviteFriendUI.this))
          {
          }
          label695:
          for (;;)
          {
            GMTrace.o(2809713917952L, 20934);
            return;
            at.AR();
            final Object localObject1 = (String)com.tencent.mm.y.c.xh().get(42, "");
            if (localObject1 != null)
            {
              paramAnonymousView = (View)localObject1;
              if (((String)localObject1).length() != 0) {}
            }
            else
            {
              at.AR();
              paramAnonymousView = (String)com.tencent.mm.y.c.xh().get(2, "");
            }
            paramAnonymousView = InviteFriendUI.this.getString(R.l.dDA, new Object[] { paramAnonymousView });
            localObject1 = Uri.parse("smsto:" + InviteFriendUI.b(InviteFriendUI.this));
            final Object localObject2 = new Intent("android.intent.action.SENDTO", (Uri)localObject1);
            ((Intent)localObject2).putExtra("sms_body", paramAnonymousView);
            final Object localObject3 = InviteFriendUI.this.getPackageManager();
            Object localObject4 = ((PackageManager)localObject3).queryIntentActivities((Intent)localObject2, 65536);
            localObject2 = new HashMap();
            localObject4 = ((List)localObject4).iterator();
            while (((Iterator)localObject4).hasNext())
            {
              ResolveInfo localResolveInfo = (ResolveInfo)((Iterator)localObject4).next();
              if (!localResolveInfo.activityInfo.packageName.equals("com.whatsapp")) {
                ((HashMap)localObject2).put(localResolveInfo.activityInfo.name, localResolveInfo);
              }
            }
            if (((HashMap)localObject2).size() == 1)
            {
              localObject3 = ((HashMap)localObject2).keySet().iterator();
              if (((Iterator)localObject3).hasNext())
              {
                localObject3 = (String)((Iterator)localObject3).next();
                localObject4 = new Intent();
                ((Intent)localObject4).setComponent(new ComponentName(((ResolveInfo)((HashMap)localObject2).get(localObject3)).activityInfo.packageName, ((ResolveInfo)((HashMap)localObject2).get(localObject3)).activityInfo.name));
                ((Intent)localObject4).setAction("android.intent.action.SENDTO");
                ((Intent)localObject4).setData((Uri)localObject1);
                ((Intent)localObject4).putExtra("sms_body", paramAnonymousView);
                InviteFriendUI.this.startActivity((Intent)localObject4);
                InviteFriendUI.c(InviteFriendUI.this);
              }
              GMTrace.o(2809713917952L, 20934);
              return;
            }
            if (((HashMap)localObject2).size() > 1)
            {
              localObject4 = new l(InviteFriendUI.this);
              ((l)localObject4).xhT = new p.a()
              {
                public final void a(ImageView paramAnonymous2ImageView, MenuItem paramAnonymous2MenuItem)
                {
                  GMTrace.i(2791997177856L, 20802);
                  paramAnonymous2MenuItem = paramAnonymous2MenuItem.getTitle();
                  paramAnonymous2ImageView.setImageDrawable(((ResolveInfo)localObject2.get(paramAnonymous2MenuItem)).loadIcon(localObject3));
                  GMTrace.o(2791997177856L, 20802);
                }
              };
              ((l)localObject4).xhU = new p.b()
              {
                public final void a(TextView paramAnonymous2TextView, MenuItem paramAnonymous2MenuItem)
                {
                  GMTrace.i(2823001473024L, 21033);
                  paramAnonymous2MenuItem = paramAnonymous2MenuItem.getTitle();
                  paramAnonymous2TextView.setText(((ResolveInfo)localObject2.get(paramAnonymous2MenuItem)).loadLabel(localObject3).toString());
                  GMTrace.o(2823001473024L, 21033);
                }
              };
              ((l)localObject4).qik = new p.c()
              {
                public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
                {
                  GMTrace.i(2811056095232L, 20944);
                  Iterator localIterator = localObject2.keySet().iterator();
                  while (localIterator.hasNext()) {
                    paramAnonymous2n.add((String)localIterator.next());
                  }
                  GMTrace.o(2811056095232L, 20944);
                }
              };
              ((l)localObject4).qil = new p.d()
              {
                public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
                {
                  GMTrace.i(2819377594368L, 21006);
                  paramAnonymous2MenuItem = paramAnonymous2MenuItem.getTitle();
                  Intent localIntent = new Intent();
                  localIntent.setComponent(new ComponentName(((ResolveInfo)localObject2.get(paramAnonymous2MenuItem)).activityInfo.packageName, ((ResolveInfo)localObject2.get(paramAnonymous2MenuItem)).activityInfo.name));
                  localIntent.setAction("android.intent.action.SENDTO");
                  localIntent.setData(localObject1);
                  localIntent.putExtra("sms_body", paramAnonymousView);
                  InviteFriendUI.this.startActivity(localIntent);
                  GMTrace.o(2819377594368L, 21006);
                }
              };
              ((l)localObject4).bpI();
              InviteFriendUI.c(InviteFriendUI.this);
              GMTrace.o(2809713917952L, 20934);
              return;
            }
            Toast.makeText(InviteFriendUI.this, R.l.dWZ, 1).show();
            GMTrace.o(2809713917952L, 20934);
            return;
            int i = o.bj(InviteFriendUI.b(InviteFriendUI.this));
            new g(InviteFriendUI.this, new g.a()
            {
              public final void n(boolean paramAnonymous2Boolean, String paramAnonymous2String)
              {
                GMTrace.i(2816424804352L, 20984);
                if (paramAnonymous2Boolean) {
                  InviteFriendUI.this.finish();
                }
                GMTrace.o(2816424804352L, 20984);
              }
            }).r(new int[] { i });
            GMTrace.o(2809713917952L, 20934);
            return;
            paramAnonymousView = new h(InviteFriendUI.this, new h.a()
            {
              public final void mv(boolean paramAnonymous2Boolean)
              {
                GMTrace.i(2816961675264L, 20988);
                if (paramAnonymous2Boolean) {
                  af.In().C(InviteFriendUI.d(InviteFriendUI.this), 1);
                }
                GMTrace.o(2816961675264L, 20988);
              }
            });
            localObject2 = InviteFriendUI.e(InviteFriendUI.this);
            localObject1 = InviteFriendUI.b(InviteFriendUI.this);
            at.wS().a(489, paramAnonymousView);
            localObject2 = af.In().jS((String)localObject2);
            if ((localObject2 == null) || (((Cursor)localObject2).getCount() <= 1)) {
              paramAnonymousView.WN((String)localObject1);
            }
            for (;;)
            {
              if (localObject2 == null) {
                break label695;
              }
              ((Cursor)localObject2).close();
              break;
              paramAnonymousView.j((Cursor)localObject2);
            }
          }
        }
      });
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2809982353408L, 20936);
          paramAnonymousView = new lv();
          paramAnonymousView.eQq.opType = 0;
          paramAnonymousView.eQq.eQs = (InviteFriendUI.b(InviteFriendUI.this) + "@qqim");
          paramAnonymousView.eQq.eQt = InviteFriendUI.f(InviteFriendUI.this);
          com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
          if (paramAnonymousView.eQr.eDb) {
            com.tencent.mm.plugin.c.a.hnH.e(new Intent().putExtra("Chat_User", InviteFriendUI.b(InviteFriendUI.this) + "@qqim"), InviteFriendUI.this);
          }
          InviteFriendUI.this.finish();
          GMTrace.o(2809982353408L, 20936);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2787970646016L, 20772);
          InviteFriendUI.this.finish();
          GMTrace.o(2787970646016L, 20772);
          return true;
        }
      });
      GMTrace.o(2817901199360L, 20995);
      return;
      localObject = af.If().jK((String)localObject);
      if (localObject != null)
      {
        localObject = com.tencent.mm.modelfriend.m.a(((com.tencent.mm.modelfriend.b)localObject).GT(), this);
        break;
      }
      localObject = null;
      break;
      label592:
      this.gDc.setImageDrawable(com.tencent.mm.br.a.b(this, R.k.cLS));
      break label214;
      label609:
      this.gDc.setImageBitmap((Bitmap)localObject);
      break label307;
      label620:
      localObject = com.tencent.mm.ac.b.hJ(this.xbJ);
      break label397;
      label631:
      this.gDc.setImageDrawable(com.tencent.mm.br.a.b(this, R.g.aVT));
      break label409;
      label648:
      this.gDc.setImageResource(R.k.aVS);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2817632763904L, 20993);
    int i = R.i.czR;
    GMTrace.o(2817632763904L, 20993);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(2818035417088L, 20996);
    if ((this.xbG == null) || (this.xbG.equals("")))
    {
      GMTrace.o(2818035417088L, 20996);
      return;
    }
    long l = com.tencent.mm.ac.b.hO(paramString);
    if ((l > 0L) && (this.xbG.equals(String.valueOf(l))) && (this.xbH == 0)) {
      this.gDc.setImageBitmap(com.tencent.mm.ac.b.a(paramString, false, -1));
    }
    GMTrace.o(2818035417088L, 20996);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2817230110720L, 20990);
    super.onCreate(paramBundle);
    oM(R.l.dDo);
    paramBundle = getIntent();
    this.xbH = paramBundle.getIntExtra("friend_type", -1);
    this.xbI = paramBundle.getStringExtra("friend_nick");
    this.xbG = paramBundle.getStringExtra("friend_num");
    this.xbJ = paramBundle.getStringExtra("friend_googleID");
    this.xbK = paramBundle.getStringExtra("friend_googleItemID");
    this.xbG = bg.nl(this.xbG);
    this.xbO = paramBundle.getStringExtra("friend_linkedInID");
    this.xbP = paramBundle.getStringExtra("friend_linkedInPicUrl");
    MP();
    this.xbM = paramBundle.getIntExtra("search_kvstat_scene", 0);
    this.xbN = paramBundle.getIntExtra("search_kvstat_position", 0);
    GMTrace.o(2817230110720L, 20990);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2817766981632L, 20994);
    super.onDestroy();
    GMTrace.o(2817766981632L, 20994);
  }
  
  protected void onPause()
  {
    GMTrace.i(2817364328448L, 20991);
    super.onPause();
    com.tencent.mm.ac.n.Dh().e(this);
    GMTrace.o(2817364328448L, 20991);
  }
  
  protected void onResume()
  {
    GMTrace.i(2817498546176L, 20992);
    super.onResume();
    com.tencent.mm.ac.n.Dh().d(this);
    GMTrace.o(2817498546176L, 20992);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\InviteFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */