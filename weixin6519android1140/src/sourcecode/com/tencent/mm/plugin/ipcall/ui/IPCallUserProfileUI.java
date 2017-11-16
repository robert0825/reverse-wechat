package com.tencent.mm.plugin.ipcall.ui;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.pluginsdk.ui.applet.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.LinkedList;

public class IPCallUserProfileUI
  extends MMActivity
{
  private String eVo;
  private String eVq;
  private ImageView hqg;
  private boolean moM;
  private TextView mtA;
  private TextView mtB;
  private LinearLayout mtC;
  private LinearLayout mtD;
  private TextView mtE;
  private TextView mtF;
  private TextView mtG;
  private TextView mtH;
  private TextView mtI;
  private Button mtJ;
  private String mtK;
  private String mtL;
  private Bitmap mtM;
  private boolean mtN;
  private Cursor mtO;
  private boolean mtP;
  private com.tencent.mm.plugin.ipcall.a.e.e mtQ;
  
  public IPCallUserProfileUI()
  {
    GMTrace.i(11683653222400L, 87050);
    this.moM = false;
    this.mtO = null;
    this.mtP = false;
    this.mtQ = new com.tencent.mm.plugin.ipcall.a.e.e();
    GMTrace.o(11683653222400L, 87050);
  }
  
  private static String AD(String paramString)
  {
    GMTrace.i(11684324311040L, 87055);
    str = "";
    if (!com.tencent.mm.pluginsdk.h.a.aS(ab.getContext(), "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
      GMTrace.o(11684324311040L, 87055);
      return null;
    }
    localCursor = ab.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { paramString }, null);
    if (localCursor == null)
    {
      GMTrace.o(11684324311040L, 87055);
      return null;
    }
    paramString = str;
    try
    {
      boolean bool = localCursor.moveToFirst();
      if (!bool) {
        break label158;
      }
      paramString = "";
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        localException1 = localException1;
        w.e("MicroMsg.IPCallUserProfileUI", "extractAddressItemFromCursor, error: %s, class: %s", new Object[] { localException1.getMessage(), localException1.getClass().getSimpleName() });
        localCursor.close();
      }
    }
    finally
    {
      localCursor.close();
    }
    str = paramString;
  }
  
  private void aJu()
  {
    GMTrace.i(11684458528768L, 87056);
    this.mtJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11626342252544L, 86623);
        IPCallUserProfileUI.d(IPCallUserProfileUI.this).start();
        IPCallUserProfileUI.d(IPCallUserProfileUI.this).mmg = 1L;
        IPCallUserProfileUI.d(IPCallUserProfileUI.this).mmh = 5L;
        IPCallUserProfileUI.d(IPCallUserProfileUI.this).finish();
        g.ork.i(12766, new Object[] { Integer.valueOf(3) });
        if (!bg.nm(IPCallUserProfileUI.e(IPCallUserProfileUI.this)))
        {
          paramAnonymousView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + IPCallUserProfileUI.AE(IPCallUserProfileUI.e(IPCallUserProfileUI.this))));
          paramAnonymousView.putExtra("sms_body", IPCallUserProfileUI.this.getString(R.l.dEo, new Object[] { q.Ak().vj() }));
          IPCallUserProfileUI.this.startActivity(paramAnonymousView);
          GMTrace.o(11626342252544L, 86623);
          return;
        }
        if (!bg.nm(IPCallUserProfileUI.f(IPCallUserProfileUI.this)))
        {
          paramAnonymousView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + IPCallUserProfileUI.f(IPCallUserProfileUI.this)));
          paramAnonymousView.putExtra("sms_body", IPCallUserProfileUI.this.getString(R.l.dEo, new Object[] { q.Ak().vj() }));
          IPCallUserProfileUI.this.startActivity(paramAnonymousView);
        }
        GMTrace.o(11626342252544L, 86623);
      }
    });
    GMTrace.o(11684458528768L, 87056);
  }
  
  private void aJv()
  {
    GMTrace.i(11684592746496L, 87057);
    if (!this.mtP)
    {
      this.mtD.setVisibility(8);
      this.mtH.setVisibility(8);
    }
    Object localObject1;
    Object localObject2;
    Object localObject4;
    if (!bg.nm(this.eVo))
    {
      localObject1 = this.eVo;
      if (!bg.nm((String)localObject1))
      {
        localObject1 = i.aIu().Ak((String)localObject1);
        if ((localObject1 != null) && (((com.tencent.mm.plugin.ipcall.a.g.c)localObject1).vmr != -1L))
        {
          long l = ((com.tencent.mm.plugin.ipcall.a.g.c)localObject1).vmr;
          localObject1 = i.aIv().fTZ;
          localObject2 = l.mmY;
          localObject4 = "calltime desc limit 4";
          localObject1 = ((com.tencent.mm.sdk.e.e)localObject1).query("IPCallRecord", (String[])localObject2, "addressId=?", new String[] { String.valueOf(l) }, null, null, (String)localObject4);
          if ((localObject1 == null) || (((Cursor)localObject1).getCount() <= 0)) {
            break label667;
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        int i;
        if (((Cursor)localObject1).moveToFirst())
        {
          i = 0;
          j = i;
          if (!((Cursor)localObject1).isAfterLast())
          {
            localObject4 = new k();
            ((k)localObject4).b((Cursor)localObject1);
            i += 1;
            if (i < 3) {
              break label695;
            }
            j = 1;
            int k = ((Cursor)localObject1).getCount();
            localObject2 = LayoutInflater.from(this).inflate(R.i.cDP, this.mtD, false);
            Object localObject5 = (TextView)((View)localObject2).findViewById(R.h.bUp);
            TextView localTextView1 = (TextView)((View)localObject2).findViewById(R.h.bUr);
            TextView localTextView2 = (TextView)((View)localObject2).findViewById(R.h.bUs);
            localTextView1.setText(com.tencent.mm.plugin.ipcall.b.a.AP(((k)localObject4).field_phonenumber));
            if (((k)localObject4).field_duration > 0L)
            {
              localTextView2.setText(com.tencent.mm.plugin.ipcall.b.c.cJ(((k)localObject4).field_duration));
              ((TextView)localObject5).setText(com.tencent.mm.plugin.ipcall.b.c.cH(((k)localObject4).field_calltime));
              if (j != 0)
              {
                ((View)localObject2).setBackgroundDrawable(getResources().getDrawable(R.g.aZa));
                int m = getResources().getDimensionPixelSize(R.f.aSG);
                ((View)localObject2).setPadding(m, 0, m, 0);
              }
              if (1 == k)
              {
                localObject4 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
                ((LinearLayout.LayoutParams)localObject4).height = com.tencent.mm.br.a.V(this.vKB.vKW, R.f.aSC);
                ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
              }
              this.mtD.addView((View)localObject2);
              if (j != 0) {
                continue;
              }
              ((Cursor)localObject1).moveToNext();
              continue;
              localObject1 = null;
              break;
              localObject2 = i.aIv();
              localObject1 = this.eVq;
              localObject2 = ((l)localObject2).fTZ;
              localObject4 = l.mmY;
              localObject5 = "calltime desc limit 4";
              localObject1 = ((com.tencent.mm.sdk.e.e)localObject2).query("IPCallRecord", (String[])localObject4, "phonenumber=?", new String[] { localObject1 }, null, null, (String)localObject5);
              break;
            }
            localTextView2.setText(com.tencent.mm.plugin.ipcall.b.c.pE(((k)localObject4).field_status));
            continue;
          }
        }
        View localView;
        this.mtD.setVisibility(8);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", new Object[] { localException.getMessage() });
        ((Cursor)localObject1).close();
        GMTrace.o(11684592746496L, 87057);
        return;
        j = i;
        if (j <= 0)
        {
          this.mtD.setVisibility(8);
          ((Cursor)localObject1).close();
          GMTrace.o(11684592746496L, 87057);
          return;
        }
        if (((Cursor)localObject1).getCount() < 4) {
          continue;
        }
        localView = LayoutInflater.from(this).inflate(R.i.cDQ, this.mtD, false);
        this.mtD.addView(localView);
        localView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(11648890830848L, 86791);
            paramAnonymousView = new Intent(IPCallUserProfileUI.this, IPCallAllRecordUI.class);
            if (!bg.nm(IPCallUserProfileUI.e(IPCallUserProfileUI.this))) {
              paramAnonymousView.putExtra("IPCallAllRecordUI_contactId", IPCallUserProfileUI.e(IPCallUserProfileUI.this));
            }
            for (;;)
            {
              paramAnonymousView.putExtra("IPCallAllRecordUI_isSinglePhoneNumber", IPCallUserProfileUI.g(IPCallUserProfileUI.this));
              IPCallUserProfileUI.this.startActivity(paramAnonymousView);
              GMTrace.o(11648890830848L, 86791);
              return;
              if (!bg.nm(IPCallUserProfileUI.f(IPCallUserProfileUI.this))) {
                paramAnonymousView.putExtra("IPCallAllRecordUI_phoneNumber", IPCallUserProfileUI.f(IPCallUserProfileUI.this));
              }
            }
          }
        });
        continue;
      }
      finally
      {
        ((Cursor)localObject1).close();
      }
      label667:
      this.mtH.setVisibility(8);
      GMTrace.o(11684592746496L, 87057);
      return;
      label695:
      int j = 0;
    }
  }
  
  private void l(final String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11684190093312L, 87054);
    View localView = LayoutInflater.from(this).inflate(R.i.cDO, this.mtC, false);
    Object localObject = (LinearLayout)localView.findViewById(R.h.bKi);
    if (!paramBoolean) {
      ((LinearLayout)localObject).setBackgroundDrawable(null);
    }
    for (;;)
    {
      localObject = (TextView)localView.findViewById(R.h.bTe);
      final TextView localTextView = (TextView)localView.findViewById(R.h.bTd);
      localTextView.setText(com.tencent.mm.plugin.ipcall.b.a.AP(com.tencent.mm.plugin.ipcall.b.c.AT(paramString)));
      ((TextView)localObject).setText(com.tencent.mm.plugin.ipcall.b.a.pD(paramInt));
      localView.setClickable(true);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11627147558912L, 86629);
          IPCallUserProfileUI.a(IPCallUserProfileUI.this, paramString);
          GMTrace.o(11627147558912L, 86629);
        }
      });
      localView.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(11662715256832L, 86894);
          IPCallUserProfileUI.a(IPCallUserProfileUI.this, localTextView);
          GMTrace.o(11662715256832L, 86894);
          return true;
        }
      });
      this.mtC.addView(localView);
      GMTrace.o(11684190093312L, 87054);
      return;
      ((LinearLayout)localObject).setBackgroundDrawable(getResources().getDrawable(R.g.aXC));
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11683787440128L, 87051);
    GMTrace.o(11683787440128L, 87051);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11684055875584L, 87053);
    int i = R.i.cAl;
    GMTrace.o(11684055875584L, 87053);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11684861181952L, 87059);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(11684861181952L, 87059);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(11683921657856L, 87052);
    super.onCreate(paramBundle);
    g.ork.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11653588451328L, 86826);
        IPCallUserProfileUI.this.finish();
        GMTrace.o(11653588451328L, 86826);
        return true;
      }
    });
    oM(R.l.dEz);
    this.hqg = ((ImageView)findViewById(R.h.bfq));
    this.mtA = ((TextView)findViewById(R.h.cgo));
    this.mtB = ((TextView)findViewById(R.h.con));
    this.mtC = ((LinearLayout)findViewById(R.h.bUo));
    this.mtE = ((TextView)findViewById(R.h.bUn));
    this.mtG = ((TextView)findViewById(R.h.bUm));
    this.mtF = ((TextView)findViewById(R.h.bUl));
    this.mtD = ((LinearLayout)findViewById(R.h.bUq));
    this.mtH = ((TextView)findViewById(R.h.bXO));
    this.mtI = ((TextView)findViewById(R.h.bHH));
    this.mtJ = ((Button)findViewById(R.h.bUk));
    this.eVo = getIntent().getStringExtra("IPCallProfileUI_contactid");
    this.mtK = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
    this.mtL = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
    this.eVq = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
    this.mtP = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
    if (!bg.nm(this.eVo))
    {
      this.mtM = com.tencent.mm.plugin.ipcall.b.a.ak(this, this.eVo);
      if (this.mtM != null) {
        this.hqg.setImageBitmap(this.mtM);
      }
    }
    if ((this.mtM == null) && (!bg.nm(this.mtL)))
    {
      this.mtM = b.a(this.mtL, false, -1);
      if (this.mtM != null) {
        this.hqg.setImageBitmap(this.mtM);
      }
    }
    if (!bg.nm(this.mtK))
    {
      this.mtA.setText(this.mtK);
      if ((bg.nm(this.mtL)) || (this.mtL.endsWith("@stranger"))) {
        break label545;
      }
      paramBundle = getString(R.l.dEA, new Object[] { r.fs(this.mtL) });
      this.mtB.setText(h.a(this, paramBundle));
    }
    label545:
    boolean bool;
    for (;;)
    {
      if (!bg.nm(this.eVo))
      {
        if (!com.tencent.mm.pluginsdk.h.a.aS(this, "android.permission.READ_CONTACTS"))
        {
          w.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
          GMTrace.o(11683921657856L, 87052);
          return;
          if (bg.nm(this.eVq)) {
            break;
          }
          this.mtA.setText(com.tencent.mm.plugin.ipcall.b.a.AP(this.eVq));
          break;
          this.mtB.setVisibility(8);
          continue;
        }
        this.mtO = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { this.eVo }, null);
        if (this.mtO.getCount() > 1) {
          break label929;
        }
        bool = true;
      }
    }
    for (;;)
    {
      this.moM = bool;
      aJv();
      this.mtG.setVisibility(8);
      this.mtF.setVisibility(8);
      this.mtE.setVisibility(8);
      this.mtJ.setVisibility(8);
      this.mtI.setVisibility(8);
      if ((!bg.nm(this.mtL)) && (!bg.nm(this.mtK)))
      {
        at.AR();
        paramBundle = com.tencent.mm.y.c.yK().TE(this.mtL);
        if ((paramBundle != null) && (!com.tencent.mm.l.a.eE(paramBundle.field_type)))
        {
          this.mtJ.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11640435113984L, 86728);
              g.ork.i(12766, new Object[] { Integer.valueOf(3) });
              paramAnonymousView = new com.tencent.mm.pluginsdk.ui.applet.a(IPCallUserProfileUI.this, new a.a()
              {
                public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
                {
                  GMTrace.i(11639495589888L, 86721);
                  w.d("MicroMsg.IPCallUserProfileUI", "canAddContact, ok: %b, hasSentVerify: %b, respUsername: %s, itemID: %s", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2), paramAnonymous2String1, paramAnonymous2String2 });
                  if (paramAnonymous2Boolean1)
                  {
                    IPCallUserProfileUI.a(IPCallUserProfileUI.this).setVisibility(8);
                    IPCallUserProfileUI.b(IPCallUserProfileUI.this).setVisibility(8);
                    IPCallUserProfileUI.b(IPCallUserProfileUI.this, paramAnonymous2String1);
                  }
                  GMTrace.o(11639495589888L, 86721);
                }
              });
              LinkedList localLinkedList = new LinkedList();
              localLinkedList.add(Integer.valueOf(86));
              paramAnonymousView.twn = new a.b()
              {
                public final boolean aJw()
                {
                  GMTrace.i(11670499885056L, 86952);
                  Intent localIntent = new Intent();
                  localIntent.putExtra("Contact_User", IPCallUserProfileUI.c(IPCallUserProfileUI.this));
                  localIntent.putExtra("Contact_Scene", 13);
                  com.tencent.mm.bj.d.b(IPCallUserProfileUI.this, "profile", ".ui.SayHiWithSnsPermissionUI", localIntent);
                  GMTrace.o(11670499885056L, 86952);
                  return true;
                }
              };
              paramAnonymousView.b(IPCallUserProfileUI.c(IPCallUserProfileUI.this), localLinkedList, true);
              GMTrace.o(11640435113984L, 86728);
            }
          });
          this.mtJ.setText(R.l.dEx);
          this.mtJ.setVisibility(0);
        }
        label741:
        paramBundle = new ArrayList();
        if ((this.mtO == null) || (this.mtO.getCount() <= 0)) {
          break label1110;
        }
      }
      try
      {
        if (this.mtO.moveToFirst()) {
          for (;;)
          {
            if (this.mtO.isAfterLast()) {
              break label1091;
            }
            i += 1;
            str = this.mtO.getString(this.mtO.getColumnIndex("data1"));
            j = this.mtO.getInt(this.mtO.getColumnIndex("data2"));
            if (!paramBundle.contains(str))
            {
              paramBundle.add(str);
              if (i != this.mtO.getCount()) {
                break;
              }
              l(str, j, false);
            }
            this.mtO.moveToNext();
          }
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          String str;
          int j;
          w.e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", new Object[] { paramBundle.getMessage() });
          this.mtO.close();
          GMTrace.o(11683921657856L, 87052);
          return;
          label929:
          bool = false;
          break;
          if ((!bg.nm(this.eVo)) && (!bg.nm(this.mtK)))
          {
            aJu();
            this.mtJ.setText(R.l.dEy);
            break label741;
          }
          if (bg.nm(this.eVq)) {
            break label741;
          }
          this.mtF.setVisibility(0);
          this.mtG.setVisibility(0);
          this.mtE.setVisibility(0);
          this.mtE.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11683519004672L, 87049);
              g.ork.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
              paramAnonymousView = new Intent("android.intent.action.INSERT");
              paramAnonymousView.setType("vnd.android.cursor.dir/contact");
              paramAnonymousView.putExtra("phone", IPCallUserProfileUI.f(IPCallUserProfileUI.this));
              IPCallUserProfileUI.this.startActivity(paramAnonymousView);
              GMTrace.o(11683519004672L, 87049);
            }
          });
          this.mtF.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11642582597632L, 86744);
              IPCallUserProfileUI.a(IPCallUserProfileUI.this, IPCallUserProfileUI.f(IPCallUserProfileUI.this));
              GMTrace.o(11642582597632L, 86744);
            }
          });
          this.mtG.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(11693048463360L, 87120);
              g.ork.i(12766, new Object[] { Integer.valueOf(4) });
              com.tencent.mm.plugin.ipcall.b.c.c(IPCallUserProfileUI.this, IPCallUserProfileUI.f(IPCallUserProfileUI.this));
              Toast.makeText(IPCallUserProfileUI.this, R.l.dEw, 0).show();
              GMTrace.o(11693048463360L, 87120);
            }
          });
          aJu();
          this.mtJ.setText(R.l.dEy);
          break label741;
          l(str, j, true);
        }
      }
      finally
      {
        this.mtO.close();
      }
    }
    label1091:
    this.mtO.close();
    GMTrace.o(11683921657856L, 87052);
    return;
    label1110:
    this.mtC.setVisibility(8);
    GMTrace.o(11683921657856L, 87052);
  }
  
  protected void onResume()
  {
    GMTrace.i(11684726964224L, 87058);
    super.onResume();
    if (this.mtN)
    {
      this.mtN = false;
      this.mtD.removeAllViews();
      aJv();
    }
    GMTrace.o(11684726964224L, 87058);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallUserProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */