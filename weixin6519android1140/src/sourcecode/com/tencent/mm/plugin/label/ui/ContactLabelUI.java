package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;
import com.tencent.mm.protocal.c.bmt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanelScrollView;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ContactLabelUI
  extends ContactLabelBaseUI
  implements com.tencent.mm.ad.e
{
  private String fKP;
  private MMTagPanelScrollView mvP;
  private MMLabelPanel mvQ;
  private TextView mvR;
  private View mvS;
  private View mvT;
  private TextView mvU;
  private MMLabelPanel mvV;
  private ListView mvW;
  private ScrollView mvX;
  private b mvY;
  private String mvZ;
  private boolean mvp;
  private ArrayList<String> mwa;
  private HashSet<String> mwb;
  private HashSet<String> mwc;
  private ArrayList<String> mwd;
  private int mwe;
  private boolean mwf;
  private ArrayList<String> mwg;
  
  public ContactLabelUI()
  {
    GMTrace.i(7310571208704L, 54468);
    this.mwb = new HashSet();
    this.mwc = new HashSet();
    this.mwd = new ArrayList();
    this.mwe = a.mwj;
    this.mwf = false;
    this.mvp = true;
    GMTrace.o(7310571208704L, 54468);
  }
  
  private void aJU()
  {
    GMTrace.i(7312316039168L, 54481);
    aJR();
    wr(getString(R.l.cQq));
    GMTrace.o(7312316039168L, 54481);
  }
  
  private void aJZ()
  {
    GMTrace.i(7312047603712L, 54479);
    w.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
    if (this.mvQ != null)
    {
      w.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
      Object localObject1 = "";
      Object localObject2 = this.mvQ.car();
      if (((ArrayList)localObject2).size() > 0) {
        localObject1 = com.tencent.mm.plugin.label.c.aN(com.tencent.mm.plugin.label.e.aJO().ae((ArrayList)localObject2));
      }
      localObject2 = new LinkedList();
      bmt localbmt = new bmt();
      localbmt.ufB = ((String)localObject1);
      localbmt.jhi = this.fKP;
      ((LinkedList)localObject2).add(localbmt);
      localObject1 = new d((LinkedList)localObject2);
      at.wS().a((k)localObject1, 0);
      if (this.mwc == null) {
        break label286;
      }
    }
    label286:
    for (int i = this.mwc.size();; i = 0)
    {
      if (this.mwa != null) {}
      for (int j = this.mwa.size();; j = 0)
      {
        if (this.mwb != null) {}
        for (int k = this.mwb.size();; k = 0)
        {
          j = k + this.mvQ.car().size() - j - i;
          if ((i > 0) || (j > 0))
          {
            w.d("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            com.tencent.mm.plugin.report.service.g.ork.i(11220, new Object[] { q.zE(), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(0) });
          }
          GMTrace.o(7312047603712L, 54479);
          return;
        }
      }
    }
  }
  
  private void aKa()
  {
    GMTrace.i(7312181821440L, 54480);
    aJR();
    this.mwc.clear();
    this.mwb.clear();
    finish();
    GMTrace.o(7312181821440L, 54480);
  }
  
  private boolean aKb()
  {
    GMTrace.i(7312450256896L, 54482);
    if (this.mvQ != null)
    {
      if ((this.mwa != null) && (this.mwa.size() > 0))
      {
        this.mvQ.car();
        ArrayList localArrayList = this.mvQ.car();
        Collections.sort(this.mwa);
        Collections.sort(localArrayList);
        if (!this.mwa.equals(localArrayList))
        {
          GMTrace.o(7312450256896L, 54482);
          return true;
        }
        GMTrace.o(7312450256896L, 54482);
        return false;
      }
      this.mvQ.car();
      if (this.mvQ.car().size() > 0)
      {
        GMTrace.o(7312450256896L, 54482);
        return true;
      }
    }
    GMTrace.o(7312450256896L, 54482);
    return false;
  }
  
  private void af(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7311913385984L, 54478);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.Label.ContactLabelUI", "tag is empty");
      GMTrace.o(7311913385984L, 54478);
      return;
    }
    paramString = paramString.trim();
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
      GMTrace.o(7311913385984L, 54478);
      return;
    }
    z localz = com.tencent.mm.plugin.label.e.aJO().Tv(paramString);
    if (paramBoolean) {
      if ((this.mwd == null) || (!this.mwd.contains(paramString)) || (localz == null)) {
        this.mwc.add(paramString);
      }
    }
    for (;;)
    {
      if ((this.mwb != null) && (this.mwb.contains(paramString))) {
        this.mwb.remove(paramString);
      }
      if (aKb()) {
        lf(true);
      }
      GMTrace.o(7311913385984L, 54478);
      return;
      if ((this.mwd == null) || (!this.mwd.contains(paramString)) || ((localz != null) && (localz.field_isTemporary))) {
        this.mwc.add(paramString);
      }
    }
  }
  
  private void pH(int paramInt)
  {
    GMTrace.i(7311779168256L, 54477);
    this.mwe = paramInt;
    switch (4.mwi[(this.mwe - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(7311779168256L, 54477);
      return;
      this.mvW.setVisibility(8);
      if ((this.mwd != null) && (this.mwd.size() > 0))
      {
        this.mvS.setVisibility(0);
        this.mvX.setVisibility(0);
      }
      for (;;)
      {
        this.mvR.setVisibility(8);
        GMTrace.o(7311779168256L, 54477);
        return;
        this.mvX.setVisibility(8);
        this.mvS.setVisibility(8);
      }
      this.mvX.setVisibility(8);
      this.mvW.setVisibility(0);
      this.mvS.setVisibility(8);
      this.mvR.setVisibility(8);
      GMTrace.o(7311779168256L, 54477);
      return;
      this.mvW.setVisibility(8);
      this.mvX.setVisibility(8);
      this.mvS.setVisibility(8);
      this.mvR.setVisibility(0);
      this.mvR.setText(R.l.dGg);
      GMTrace.o(7311779168256L, 54477);
      return;
      this.mvW.setVisibility(8);
      this.mvX.setVisibility(8);
      this.mvS.setVisibility(8);
      this.mvR.setVisibility(0);
      this.mvR.setText(R.l.dGg);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(7310839644160L, 54470);
    sq(getString(R.l.cQt));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7288559501312L, 54304);
        ContactLabelUI.this.onBackPressed();
        GMTrace.o(7288559501312L, 54304);
        return false;
      }
    });
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7285606711296L, 54282);
        ContactLabelUI.a(ContactLabelUI.this);
        GMTrace.o(7285606711296L, 54282);
        return false;
      }
    }, p.b.vLG);
    this.mvP = ((MMTagPanelScrollView)findViewById(R.h.bJB));
    this.mvP.wfE = 3;
    this.mvQ = ((MMLabelPanel)findViewById(R.h.bJA));
    this.mvR = ((TextView)findViewById(R.h.bJD));
    this.mvS = findViewById(R.h.bJz);
    this.mvT = findViewById(R.h.bJy);
    this.mvT.setBackgroundDrawable(null);
    this.mvU = ((TextView)this.mvT.findViewById(16908310));
    this.mvU.setText(R.l.bJx);
    this.mvV = ((MMLabelPanel)findViewById(R.h.bJx));
    this.mvW = ((ListView)findViewById(R.h.bJC));
    this.mvX = ((ScrollView)findViewById(R.h.bJE));
    if (this.mvX != null) {
      this.mvX.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(7317282095104L, 54518);
          if (paramAnonymousMotionEvent.getAction() == 2) {
            ContactLabelUI.this.aLo();
          }
          GMTrace.o(7317282095104L, 54518);
          return false;
        }
      });
    }
    this.mvQ.wfd = true;
    this.mvQ.lJ(true);
    this.mvQ.Cc(R.g.baJ);
    this.mvQ.wfk = new MMTagPanel.a()
    {
      public final void atg()
      {
        GMTrace.i(7287217324032L, 54294);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextClick]");
        GMTrace.o(7287217324032L, 54294);
      }
      
      public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(7287619977216L, 54297);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagLengthMax] match:%s exceedCount:%d", new Object[] { String.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousBoolean)
        {
          ContactLabelUI.this.lf(false);
          ContactLabelUI.e(ContactLabelUI.this).setVisibility(0);
          ContactLabelUI.e(ContactLabelUI.this).setText(R.l.dGg);
          ContactLabelUI.e(ContactLabelUI.this).setText(String.format(ContactLabelUI.this.getString(R.l.dGg), new Object[] { Integer.valueOf(com.tencent.mm.ui.tools.h.aO(36, "")), Integer.valueOf(paramAnonymousInt) }));
          GMTrace.o(7287619977216L, 54297);
          return;
        }
        ContactLabelUI.this.lf(true);
        ContactLabelUI.e(ContactLabelUI.this).setVisibility(8);
        GMTrace.o(7287619977216L, 54297);
      }
      
      public final void wv(String paramAnonymousString)
      {
        GMTrace.i(7286814670848L, 54291);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagUnSelected] tag:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bb(paramAnonymousString, false);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        GMTrace.o(7286814670848L, 54291);
      }
      
      public final void ww(String paramAnonymousString)
      {
        GMTrace.i(7286948888576L, 54292);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagSelected] tag:%s", new Object[] { paramAnonymousString });
        GMTrace.o(7286948888576L, 54292);
      }
      
      public final void wx(String paramAnonymousString)
      {
        GMTrace.i(7287083106304L, 54293);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagRemove] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bb(paramAnonymousString, false);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        GMTrace.o(7287083106304L, 54293);
      }
      
      public final void wy(String paramAnonymousString)
      {
        GMTrace.i(7287351541760L, 54295);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextChange] curText:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this, paramAnonymousString);
        GMTrace.o(7287351541760L, 54295);
      }
      
      public final void wz(String paramAnonymousString)
      {
        GMTrace.i(7287485759488L, 54296);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagCreate] tag:%s", new Object[] { paramAnonymousString });
        if (bg.nm(paramAnonymousString))
        {
          w.d("MicroMsg.Label.ContactLabelUI", "tag is null.");
          GMTrace.o(7287485759488L, 54296);
          return;
        }
        ContactLabelUI.b(ContactLabelUI.this).ba(paramAnonymousString, true);
        if (ContactLabelUI.c(ContactLabelUI.this) != null) {
          ContactLabelUI.c(ContactLabelUI.this).bb(paramAnonymousString, true);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
        GMTrace.o(7287485759488L, 54296);
      }
    };
    this.mvV.lJ(false);
    this.mvV.wfk = new MMTagPanel.a()
    {
      public final void atg()
      {
        GMTrace.i(7302920798208L, 54411);
        GMTrace.o(7302920798208L, 54411);
      }
      
      public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(7302786580480L, 54410);
        GMTrace.o(7302786580480L, 54410);
      }
      
      public final void wv(String paramAnonymousString)
      {
        GMTrace.i(7302383927296L, 54407);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagUnSelected] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.b(ContactLabelUI.this) != null) {
          ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        GMTrace.o(7302383927296L, 54407);
      }
      
      public final void ww(String paramAnonymousString)
      {
        GMTrace.i(7302518145024L, 54408);
        w.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagSelected] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.b(ContactLabelUI.this) != null) {
          ContactLabelUI.b(ContactLabelUI.this).ba(paramAnonymousString, true);
        }
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
        GMTrace.o(7302518145024L, 54408);
      }
      
      public final void wx(String paramAnonymousString)
      {
        GMTrace.i(7302652362752L, 54409);
        GMTrace.o(7302652362752L, 54409);
      }
      
      public final void wy(String paramAnonymousString)
      {
        GMTrace.i(7303055015936L, 54412);
        GMTrace.o(7303055015936L, 54412);
      }
      
      public final void wz(String paramAnonymousString)
      {
        GMTrace.i(7303189233664L, 54413);
        GMTrace.o(7303189233664L, 54413);
      }
    };
    this.mvW.setAdapter(this.mvY);
    this.mvW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7316074135552L, 54509);
        if (ContactLabelUI.f(ContactLabelUI.this) == null)
        {
          GMTrace.o(7316074135552L, 54509);
          return;
        }
        paramAnonymousAdapterView = ContactLabelUI.f(ContactLabelUI.this).iH(paramAnonymousInt);
        if ((!bg.nm(paramAnonymousAdapterView)) && (ContactLabelUI.b(ContactLabelUI.this) != null))
        {
          ContactLabelUI.b(ContactLabelUI.this).can();
          ContactLabelUI.b(ContactLabelUI.this).ba(paramAnonymousAdapterView, true);
          ContactLabelUI.c(ContactLabelUI.this).bb(paramAnonymousAdapterView, true);
        }
        GMTrace.o(7316074135552L, 54509);
      }
    });
    lf(false);
    GMTrace.o(7310839644160L, 54470);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7311510732800L, 54475);
    w.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    case 636: 
    case 637: 
    default: 
      w.w("MicroMsg.Label.ContactLabelUI", "unknow type.");
      GMTrace.o(7311510732800L, 54475);
      return;
    case 635: 
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aJZ();
        GMTrace.o(7311510732800L, 54475);
        return;
      }
      aJU();
      GMTrace.o(7311510732800L, 54475);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
      aKa();
      GMTrace.o(7311510732800L, 54475);
      return;
    }
    aJU();
    GMTrace.o(7311510732800L, 54475);
  }
  
  public void finish()
  {
    GMTrace.i(7312584474624L, 54483);
    if (this.mvQ != null) {
      this.mvQ.caq();
    }
    Intent localIntent = new Intent();
    if (aKb()) {
      localIntent.putExtra("hasLableChange", true);
    }
    for (;;)
    {
      setResult(-1, localIntent);
      super.finish();
      GMTrace.o(7312584474624L, 54483);
      return;
      localIntent.putExtra("hasLableChange", false);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7310705426432L, 54469);
    int i = R.i.ctR;
    GMTrace.o(7310705426432L, 54469);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7311644950528L, 54476);
    if (aKb())
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dUL), "", getString(R.l.dbE), getString(R.l.dbF), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7315268829184L, 54503);
          ContactLabelUI.a(ContactLabelUI.this);
          GMTrace.o(7315268829184L, 54503);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7279701131264L, 54238);
          ContactLabelUI.this.finish();
          GMTrace.o(7279701131264L, 54238);
        }
      });
      GMTrace.o(7311644950528L, 54476);
      return;
    }
    super.onBackPressed();
    GMTrace.o(7311644950528L, 54476);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7310973861888L, 54471);
    super.onCreate(paramBundle);
    this.mvZ = getIntent().getStringExtra("label_id_list");
    this.mwa = getIntent().getStringArrayListExtra("label_str_list");
    this.fKP = getIntent().getStringExtra("label_username");
    this.mwf = getIntent().getBooleanExtra("is_stranger", false);
    this.mvY = new b(this);
    MP();
    if ((!bg.nm(this.mvZ)) && (this.mwa != null) && (this.mwa.size() > 0)) {
      this.mvQ.a(this.mwa, this.mwa);
    }
    if (this.mwf)
    {
      this.mwg = getIntent().getStringArrayListExtra("label_str_list");
      this.mvQ.a(this.mwg, this.mwg);
    }
    GMTrace.o(7310973861888L, 54471);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7311376515072L, 54474);
    super.onDestroy();
    GMTrace.o(7311376515072L, 54474);
  }
  
  protected void onPause()
  {
    GMTrace.i(7311242297344L, 54473);
    at.wS().b(635, this);
    at.wS().b(638, this);
    super.onPause();
    GMTrace.o(7311242297344L, 54473);
  }
  
  protected void onResume()
  {
    GMTrace.i(7311108079616L, 54472);
    at.wS().a(635, this);
    at.wS().a(638, this);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7294196645888L, 54346);
        ContactLabelUI.g(ContactLabelUI.this).clear();
        ContactLabelUI.h(ContactLabelUI.this).clear();
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3;
        if (ContactLabelUI.b(ContactLabelUI.this) != null)
        {
          if (ContactLabelUI.d(ContactLabelUI.this))
          {
            localObject1 = null;
            at.AR();
            localObject2 = com.tencent.mm.y.c.yL().CC(ContactLabelUI.i(ContactLabelUI.this));
            if (localObject2 != null) {
              localObject1 = ((bb)localObject2).field_contactLabels;
            }
            localObject3 = localObject1;
            if (bg.nm((String)localObject1))
            {
              at.AR();
              x localx = com.tencent.mm.y.c.yK().TE(ContactLabelUI.i(ContactLabelUI.this));
              localObject3 = localx.field_encryptUsername;
              localObject2 = localObject1;
              if (!bg.nm((String)localObject3))
              {
                at.AR();
                localObject3 = com.tencent.mm.y.c.yL().CC((String)localObject3);
                localObject2 = localObject1;
                if (localObject3 != null) {
                  localObject2 = ((bb)localObject3).field_contactLabels;
                }
              }
              localObject3 = localObject2;
              if (bg.nm((String)localObject2))
              {
                localObject1 = localx.field_username;
                at.AR();
                localObject1 = com.tencent.mm.y.c.yL().CC((String)localObject1);
                localObject3 = localObject2;
                if (localObject1 != null) {
                  localObject3 = ((bb)localObject1).field_contactLabels;
                }
              }
            }
            localObject1 = (ArrayList)a.aJP().AW((String)localObject3);
            ContactLabelUI.b(ContactLabelUI.this).a((Collection)localObject1, (List)localObject1);
            ContactLabelUI.a(ContactLabelUI.this, (ArrayList)localObject1);
          }
        }
        else if (ContactLabelUI.c(ContactLabelUI.this) != null)
        {
          ContactLabelUI.b(ContactLabelUI.this, com.tencent.mm.plugin.label.e.aJO().bSG());
          if ((ContactLabelUI.j(ContactLabelUI.this) == null) || (ContactLabelUI.j(ContactLabelUI.this).size() <= 0)) {
            break label419;
          }
          ContactLabelUI.d(ContactLabelUI.this);
          ContactLabelUI.c(ContactLabelUI.this).a((Collection)localObject1, ContactLabelUI.j(ContactLabelUI.this));
          if (ContactLabelUI.k(ContactLabelUI.this))
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
            ContactLabelUI.l(ContactLabelUI.this);
          }
        }
        for (;;)
        {
          ContactLabelUI.a(ContactLabelUI.this, ContactLabelUI.a.mwj);
          GMTrace.o(7294196645888L, 54346);
          return;
          at.AR();
          localObject3 = com.tencent.mm.y.c.yK().TE(ContactLabelUI.i(ContactLabelUI.this));
          localObject1 = localObject2;
          if (localObject3 == null) {
            break;
          }
          localObject3 = ((com.tencent.mm.g.b.af)localObject3).field_contactLabelIds;
          localObject1 = localObject2;
          if (bg.nm((String)localObject3)) {
            break;
          }
          localObject1 = (ArrayList)a.aJP().AX((String)localObject3);
          break;
          label419:
          if (ContactLabelUI.k(ContactLabelUI.this))
          {
            com.tencent.mm.plugin.report.service.g.ork.i(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
            ContactLabelUI.l(ContactLabelUI.this);
          }
        }
      }
    });
    super.onResume();
    GMTrace.o(7311108079616L, 54472);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(7287888412672L, 54299);
      mwj = 1;
      mwk = 2;
      mwl = 3;
      mwm = 4;
      mwn = new int[] { mwj, mwk, mwl, mwm };
      GMTrace.o(7287888412672L, 54299);
    }
    
    public static int[] aKc()
    {
      GMTrace.i(7287754194944L, 54298);
      int[] arrayOfInt = (int[])mwn.clone();
      GMTrace.o(7287754194944L, 54298);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\ContactLabelUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */