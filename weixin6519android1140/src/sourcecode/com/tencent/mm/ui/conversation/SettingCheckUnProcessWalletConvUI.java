package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.HashMap;
import java.util.List;

public class SettingCheckUnProcessWalletConvUI
  extends MMActivity
{
  private ListView juD;
  private int[] wXe;
  private List<String> wZh;
  private a wZi;
  
  public SettingCheckUnProcessWalletConvUI()
  {
    GMTrace.i(19152064479232L, 142694);
    this.wXe = new int[2];
    GMTrace.o(19152064479232L, 142694);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19152332914688L, 142696);
    int i = R.i.cFV;
    GMTrace.o(19152332914688L, 142696);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19152198696960L, 142695);
    super.onCreate(paramBundle);
    oM(R.l.ejw);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19157835841536L, 142737);
        SettingCheckUnProcessWalletConvUI.this.finish();
        GMTrace.o(19157835841536L, 142737);
        return false;
      }
    });
    this.juD = ((ListView)findViewById(R.h.bsa));
    this.wZh = getIntent().getStringArrayListExtra("key_conversation_list");
    if ((this.wZh != null) && (this.wZh.size() > 0))
    {
      this.wZi = new a();
      this.juD.setAdapter(this.wZi);
      this.juD.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(19160251760640L, 142755);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(19160251760640L, 142755);
            return false;
            SettingCheckUnProcessWalletConvUI.this.aLo();
            SettingCheckUnProcessWalletConvUI.a(SettingCheckUnProcessWalletConvUI.this)[0] = ((int)paramAnonymousMotionEvent.getRawX());
            SettingCheckUnProcessWalletConvUI.a(SettingCheckUnProcessWalletConvUI.this)[1] = ((int)paramAnonymousMotionEvent.getRawY());
          }
        }
      });
      this.juD.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(19157567406080L, 142735);
          paramAnonymousAdapterView = SettingCheckUnProcessWalletConvUI.b(SettingCheckUnProcessWalletConvUI.this).DH(paramAnonymousInt);
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(19157567406080L, 142735);
            return;
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("Chat_User", paramAnonymousAdapterView.field_username);
          paramAnonymousView.putExtra("chat_from_scene", 4);
          com.tencent.mm.bj.d.a(SettingCheckUnProcessWalletConvUI.this, ".ui.chatting.En_5b8fbb1e", paramAnonymousView);
          GMTrace.o(19157567406080L, 142735);
        }
      });
      this.juD.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(final AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(19158372712448L, 142741);
          paramAnonymousAdapterView = SettingCheckUnProcessWalletConvUI.b(SettingCheckUnProcessWalletConvUI.this).DH(paramAnonymousInt - SettingCheckUnProcessWalletConvUI.c(SettingCheckUnProcessWalletConvUI.this).getHeaderViewsCount());
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(19158372712448L, 142741);
            return true;
          }
          final String str = paramAnonymousAdapterView.field_username;
          com.tencent.mm.ui.widget.h localh = new com.tencent.mm.ui.widget.h(SettingCheckUnProcessWalletConvUI.this);
          localh.xqG = new View.OnCreateContextMenuListener()
          {
            public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
            {
              GMTrace.i(19153406656512L, 142704);
              paramAnonymous2ContextMenu.add(0, 1, 0, R.l.dHT);
              GMTrace.o(19153406656512L, 142704);
            }
          };
          localh.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, SettingCheckUnProcessWalletConvUI.this, new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(19159983325184L, 142753);
              if (paramAnonymous2MenuItem.getItemId() == 1) {
                b.a(str, SettingCheckUnProcessWalletConvUI.this, paramAnonymousAdapterView, new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(20328482865152L, 151459);
                    SettingCheckUnProcessWalletConvUI.d(SettingCheckUnProcessWalletConvUI.this).remove(SettingCheckUnProcessWalletConvUI.4.2.this.fTa);
                    SettingCheckUnProcessWalletConvUI.b(SettingCheckUnProcessWalletConvUI.this).notifyDataSetChanged();
                    GMTrace.o(20328482865152L, 151459);
                  }
                }, false, true);
              }
              GMTrace.o(19159983325184L, 142753);
            }
          }, SettingCheckUnProcessWalletConvUI.a(SettingCheckUnProcessWalletConvUI.this)[0], SettingCheckUnProcessWalletConvUI.a(SettingCheckUnProcessWalletConvUI.this)[1]);
          GMTrace.o(19158372712448L, 142741);
          return true;
        }
      });
    }
    GMTrace.o(19152198696960L, 142695);
  }
  
  private final class a
    extends BaseAdapter
  {
    private final int wWG;
    private final int wWH;
    private float woL;
    protected float woM;
    private float woN;
    private ColorStateList[] woO;
    private HashMap<String, a> woP;
    
    public a()
    {
      GMTrace.i(19150722301952L, 142684);
      this.woO = new ColorStateList[5];
      this.woL = -1.0F;
      this.woM = -1.0F;
      this.woN = -1.0F;
      this.woO[0] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOa);
      this.woO[1] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOu);
      this.woO[3] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOE);
      this.woO[2] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOs);
      this.woO[2] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOs);
      this.woO[4] = a.U(SettingCheckUnProcessWalletConvUI.this, R.e.aOk);
      if (a.ed(SettingCheckUnProcessWalletConvUI.this)) {
        this.wWH = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(R.f.aPJ);
      }
      for (this.wWG = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(R.f.aPK);; this.wWG = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(R.f.aPL))
      {
        this.woL = a.V(SettingCheckUnProcessWalletConvUI.this, R.f.aQF);
        this.woM = a.V(SettingCheckUnProcessWalletConvUI.this, R.f.aQo);
        this.woN = a.V(SettingCheckUnProcessWalletConvUI.this, R.f.aQR);
        this.woP = new HashMap();
        GMTrace.o(19150722301952L, 142684);
        return;
        this.wWH = SettingCheckUnProcessWalletConvUI.this.getResources().getDimensionPixelSize(R.f.aPI);
      }
    }
    
    private static String VP(String paramString)
    {
      GMTrace.i(19151796043776L, 142692);
      if ((paramString != null) && (paramString.length() == 32))
      {
        paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramString);
        GMTrace.o(19151796043776L, 142692);
        return paramString;
      }
      GMTrace.o(19151796043776L, 142692);
      return null;
    }
    
    private CharSequence c(ae paramae, int paramInt, boolean paramBoolean)
    {
      GMTrace.i(19151661826048L, 142691);
      if ((!com.tencent.mm.platformtools.t.nm(paramae.field_editingMsg)) && ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)))
      {
        localObject1 = new SpannableStringBuilder(SettingCheckUnProcessWalletConvUI.this.getString(R.l.dHL));
        ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
        ((SpannableStringBuilder)localObject1).append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(SettingCheckUnProcessWalletConvUI.this, paramae.field_editingMsg, paramInt));
        GMTrace.o(19151661826048L, 142691);
        return (CharSequence)localObject1;
      }
      Object localObject1 = paramae.field_digest;
      if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
      {
        paramae = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.d(SettingCheckUnProcessWalletConvUI.this, (CharSequence)localObject1, paramInt));
        GMTrace.o(19151661826048L, 142691);
        return paramae;
      }
      localObject1 = paramae.field_username;
      int i;
      if (((String)localObject1).equals("qqmail"))
      {
        at.AR();
        if (com.tencent.mm.platformtools.t.e((Integer)com.tencent.mm.y.c.xh().get(17, null)) == 1) {}
        for (i = 1; i == 0; i = 0)
        {
          paramae = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dZT);
          GMTrace.o(19151661826048L, 142691);
          return paramae;
        }
      }
      if (((String)localObject1).equals("tmessage"))
      {
        at.AR();
        localObject1 = com.tencent.mm.y.c.yS().CB("@t.qq.com");
        if ((localObject1 != null) && (((ay)localObject1).isEnable())) {}
        for (i = 1; i == 0; i = 0)
        {
          paramae = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dZT);
          GMTrace.o(19151661826048L, 142691);
          return paramae;
        }
      }
      String str1;
      if ((paramae.field_msgType != null) && ((paramae.field_msgType.equals("47")) || (paramae.field_msgType.equals("1048625"))))
      {
        localObject1 = VP(paramae.field_digest);
        str1 = "";
        if (localObject1 != null)
        {
          paramae = "[" + (String)localObject1 + "]";
          GMTrace.o(19151661826048L, 142691);
          return paramae;
        }
        localObject1 = str1;
        if (paramae.field_digest != null)
        {
          localObject1 = str1;
          if (paramae.field_digest.contains(":"))
          {
            str1 = paramae.field_digest.substring(0, paramae.field_digest.indexOf(":"));
            String str2 = VP(paramae.field_digest.substring(paramae.field_digest.indexOf(":") + 1).replace(" ", ""));
            localObject1 = str1;
            if (str2 != null)
            {
              paramae = "[" + str2 + "]";
              if (com.tencent.mm.platformtools.t.nm(str1))
              {
                GMTrace.o(19151661826048L, 142691);
                return paramae;
              }
              paramae = str1 + ": " + paramae;
              GMTrace.o(19151661826048L, 142691);
              return paramae;
            }
          }
        }
        str1 = SettingCheckUnProcessWalletConvUI.this.getString(R.l.cSD);
        if (com.tencent.mm.platformtools.t.nm((String)localObject1))
        {
          localObject1 = str1;
          paramae.cO((String)localObject1);
        }
      }
      else
      {
        if (com.tencent.mm.platformtools.t.nm(paramae.field_digest)) {
          break label807;
        }
        if (com.tencent.mm.platformtools.t.nm(paramae.field_digestUser)) {
          break label796;
        }
        if ((paramae.field_isSend != 0) || (!com.tencent.mm.y.s.eb(paramae.field_username))) {
          break label784;
        }
        localObject1 = r.F(paramae.field_digestUser, paramae.field_username);
      }
      label784:
      label796:
      label807:
      Object localObject2;
      for (;;)
      {
        try
        {
          localObject1 = String.format(paramae.field_digest, new Object[] { localObject1 });
          str1 = ((String)localObject1).replace('\n', ' ');
          if ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)) {
            break label838;
          }
          paramae = new SpannableStringBuilder(SettingCheckUnProcessWalletConvUI.this.getString(R.l.dHH));
          paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
          paramae.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(SettingCheckUnProcessWalletConvUI.this, str1, paramInt));
          GMTrace.o(19151661826048L, 142691);
          return paramae;
        }
        catch (Exception localException) {}
        localObject1 = (String)localObject1 + ": " + str1;
        break;
        localObject1 = r.fs(paramae.field_digestUser);
        continue;
        localObject1 = paramae.field_digest;
        continue;
        localObject2 = com.tencent.mm.booter.notification.a.h.a(paramae.field_isSend, paramae.field_username, paramae.field_content, tE(paramae.field_msgType), SettingCheckUnProcessWalletConvUI.this);
      }
      label838:
      if ((paramBoolean) && (paramae.field_unReadCount > 1)) {
        localObject2 = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });
      }
      for (;;)
      {
        paramae = com.tencent.mm.pluginsdk.ui.d.h.c(SettingCheckUnProcessWalletConvUI.this, (CharSequence)localObject2, paramInt);
        GMTrace.o(19151661826048L, 142691);
        return paramae;
        localObject2 = str1;
        if (paramae.field_unReadCount > 1)
        {
          localObject2 = str1;
          if (com.tencent.mm.y.s.gc(paramae.field_parentRef)) {
            localObject2 = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });
          }
        }
      }
    }
    
    private CharSequence i(ae paramae)
    {
      GMTrace.i(19151527608320L, 142690);
      if (paramae.field_status == 1)
      {
        paramae = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dIe);
        GMTrace.o(19151527608320L, 142690);
        return paramae;
      }
      if (paramae.field_conversationTime == Long.MAX_VALUE)
      {
        GMTrace.o(19151527608320L, 142690);
        return "";
      }
      paramae = com.tencent.mm.pluginsdk.i.n.c(SettingCheckUnProcessWalletConvUI.this, paramae.field_conversationTime, true);
      GMTrace.o(19151527608320L, 142690);
      return paramae;
    }
    
    private static int tE(String paramString)
    {
      int j = 1;
      GMTrace.i(19151393390592L, 142689);
      int i = j;
      if (paramString != null)
      {
        i = j;
        if (paramString.length() <= 0) {}
      }
      try
      {
        i = Integer.valueOf(paramString).intValue();
        GMTrace.o(19151393390592L, 142689);
        return i;
      }
      catch (NumberFormatException paramString)
      {
        for (;;)
        {
          i = j;
        }
      }
    }
    
    public final ae DH(int paramInt)
    {
      GMTrace.i(19150990737408L, 142686);
      Object localObject = (String)SettingCheckUnProcessWalletConvUI.d(SettingCheckUnProcessWalletConvUI.this).get(paramInt);
      at.AR();
      localObject = com.tencent.mm.y.c.yP().TO((String)localObject);
      GMTrace.o(19150990737408L, 142686);
      return (ae)localObject;
    }
    
    public final int getCount()
    {
      GMTrace.i(19150856519680L, 142685);
      int i = SettingCheckUnProcessWalletConvUI.d(SettingCheckUnProcessWalletConvUI.this).size();
      GMTrace.o(19150856519680L, 142685);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19151124955136L, 142687);
      long l = paramInt;
      GMTrace.o(19151124955136L, 142687);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19151259172864L, 142688);
      if (paramView == null)
      {
        paramViewGroup = new b();
        if (a.ed(SettingCheckUnProcessWalletConvUI.this))
        {
          paramView = View.inflate(SettingCheckUnProcessWalletConvUI.this, R.i.cua, null);
          paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
          paramViewGroup.woT = ((NoMeasuredTextView)paramView.findViewById(R.h.bQX));
          paramViewGroup.wXc = ((NoMeasuredTextView)paramView.findViewById(R.h.cfB));
          paramViewGroup.woU = ((NoMeasuredTextView)paramView.findViewById(R.h.cjq));
          paramViewGroup.woV = ((NoMeasuredTextView)paramView.findViewById(R.h.bJH));
          paramViewGroup.jpZ = ((TextView)paramView.findViewById(R.h.chA));
          paramViewGroup.jpZ.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(SettingCheckUnProcessWalletConvUI.this));
          paramViewGroup.woW = ((ImageView)paramView.findViewById(R.h.bGV));
          paramViewGroup.woY = paramView.findViewById(R.h.bfr);
          paramViewGroup.woX = ((ImageView)paramView.findViewById(R.h.cgK));
          paramViewGroup.wXd = ((ImageView)paramView.findViewById(R.h.bLi));
          paramView.setTag(paramViewGroup);
          paramViewGroup.woV.J(this.woM);
          paramViewGroup.woU.J(this.woN);
          paramViewGroup.woT.J(this.woL);
          paramViewGroup.wXc.J(this.woM);
          paramViewGroup.woV.setTextColor(this.woO[0]);
          paramViewGroup.woU.setTextColor(this.woO[4]);
          paramViewGroup.woT.setTextColor(this.woO[3]);
          paramViewGroup.wXc.setTextColor(this.woO[0]);
          paramViewGroup.woV.whw = true;
          paramViewGroup.woU.whw = false;
          paramViewGroup.woT.whw = true;
          paramViewGroup.wXc.whw = true;
          paramViewGroup.woU.xS();
        }
      }
      ae localae;
      for (;;)
      {
        localae = DH(paramInt);
        if (localae != null) {
          break label384;
        }
        GMTrace.o(19151259172864L, 142688);
        return paramView;
        paramView = View.inflate(SettingCheckUnProcessWalletConvUI.this, R.i.ctZ, null);
        break;
        paramViewGroup = (b)paramView.getTag();
      }
      label384:
      a.b.a(paramViewGroup.hqG, localae.field_username);
      paramViewGroup.hqG.getDrawable();
      String str2 = localae.field_username;
      Object localObject2 = (a)this.woP.get(str2);
      Object localObject1 = localObject2;
      boolean bool;
      if (localObject2 == null)
      {
        localObject2 = new a();
        ((a)localObject2).wWT = -1;
        ((a)localObject2).wWS = -1;
        ((a)localObject2).wWX = false;
        ((a)localObject2).wWZ = false;
        ((a)localObject2).wWY = false;
        ((a)localObject2).sdk = com.tencent.mm.y.s.eb(localae.field_username);
        if ((((a)localObject2).sdk) && (((a)localObject2).wWY) && (localae.field_unReadCount > 0))
        {
          bool = true;
          ((a)localObject2).wWW = bool;
          ((a)localObject2).jHw = 0;
          if ((tE(localae.field_msgType) == 34) && (localae.field_isSend == 0) && (!com.tencent.mm.platformtools.t.nm(localae.field_content)))
          {
            String str1 = localae.field_content;
            if (!str2.equals("qmessage"))
            {
              localObject1 = str1;
              if (!str2.equals("floatbottle")) {}
            }
            else
            {
              String[] arrayOfString = str1.split(":");
              localObject1 = str1;
              if (arrayOfString != null)
              {
                localObject1 = str1;
                if (arrayOfString.length > 3) {
                  localObject1 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
                }
              }
            }
            if (!new com.tencent.mm.modelvoice.n((String)localObject1).hco) {
              ((a)localObject2).jHw = 1;
            }
          }
          localObject1 = r.fs(str2);
          if ((!((a)localObject2).sdk) || (localObject1 != null)) {
            break label1245;
          }
          ((a)localObject2).nickName = SettingCheckUnProcessWalletConvUI.this.getString(R.l.dhh);
          label723:
          ((a)localObject2).wWP = i(localae);
          ((a)localObject2).wWQ = c(localae, (int)paramViewGroup.woV.fB.getTextSize(), ((a)localObject2).wWW);
          ((a)localObject2).wXa = localae.field_attrflag;
        }
      }
      else
      {
        switch (localae.field_status)
        {
        case 3: 
        case 4: 
        default: 
          paramInt = -1;
          label818:
          ((a)localObject2).wWR = paramInt;
          ((a)localObject2).wWU = com.tencent.mm.y.s.a(localae);
          at.AR();
          ((a)localObject2).woQ = com.tencent.mm.y.c.yP().g(localae);
          ((a)localObject2).wWV = false;
          ((a)localObject2).tpw = v.bPG();
          this.woP.put(str2, localObject2);
          localObject1 = localObject2;
          if (((a)localObject1).wWP == null) {
            ((a)localObject1).wWP = i(localae);
          }
          if ((((a)localObject1).wWW) || (com.tencent.mm.y.s.gc(localae.field_parentRef)))
          {
            paramViewGroup.woV.setTextColor(this.woO[0]);
            label934:
            if (!str2.toLowerCase().endsWith("@t.qq.com")) {
              break label1319;
            }
            paramViewGroup.woT.Cg(R.g.aXn);
            paramViewGroup.woT.lL(true);
            label966:
            paramInt = ((a)localObject1).wWR;
            if (paramInt == -1) {
              break label1330;
            }
            paramViewGroup.woV.Cf(paramInt);
            paramViewGroup.woV.lK(true);
            label993:
            paramViewGroup.woT.setText(((a)localObject1).nickName);
            paramViewGroup.wXc.setVisibility(8);
            localObject2 = paramViewGroup.woU.getLayoutParams();
            if (((a)localObject1).wWP.length() <= 9) {
              break label1341;
            }
            if (((ViewGroup.LayoutParams)localObject2).width != this.wWH)
            {
              ((ViewGroup.LayoutParams)localObject2).width = this.wWH;
              paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
            label1068:
            w.v("MicroMsg.SettingCheckUnProcessWalletConvUI", "layout update time width %d", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject2).width) });
            paramViewGroup.woU.setText(((a)localObject1).wWP);
            paramViewGroup.woV.setText(((a)localObject1).wWQ);
            if ((!((a)localObject1).sdk) || (!((a)localObject1).wWY)) {
              break label1374;
            }
            paramViewGroup.woW.setVisibility(0);
            label1140:
            a.b.a(paramViewGroup.hqG, str2);
            if ((!((a)localObject1).wWU) && (((a)localObject1).woQ) && (at.AU()))
            {
              at.AR();
              com.tencent.mm.y.c.yP().f(localae);
            }
            if ((!((a)localObject1).woQ) || (localae.field_conversationTime == -1L)) {
              break label1405;
            }
            paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
          }
          break;
        }
      }
      for (;;)
      {
        paramViewGroup.woX.setVisibility(8);
        GMTrace.o(19151259172864L, 142688);
        return paramView;
        bool = false;
        break;
        label1245:
        ((a)localObject2).nickName = com.tencent.mm.pluginsdk.ui.d.h.b(SettingCheckUnProcessWalletConvUI.this, r.fs(str2), paramViewGroup.woT.fB.getTextSize());
        break label723;
        paramInt = -1;
        break label818;
        paramInt = R.k.cNc;
        break label818;
        paramInt = -1;
        break label818;
        paramInt = R.k.cNb;
        break label818;
        paramViewGroup.woV.setTextColor(this.woO[localObject1.jHw]);
        break label934;
        label1319:
        paramViewGroup.woT.lL(false);
        break label966;
        label1330:
        paramViewGroup.woV.lK(false);
        break label993;
        label1341:
        if (((ViewGroup.LayoutParams)localObject2).width == this.wWG) {
          break label1068;
        }
        ((ViewGroup.LayoutParams)localObject2).width = this.wWG;
        paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break label1068;
        label1374:
        if (((a)localObject1).wWV)
        {
          paramViewGroup.woW.setVisibility(0);
          break label1140;
        }
        paramViewGroup.woW.setVisibility(8);
        break label1140;
        label1405:
        paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
      }
    }
    
    private final class a
    {
      public int jHw;
      public CharSequence nickName;
      public boolean sdk;
      public boolean tpw;
      public CharSequence wWP;
      public CharSequence wWQ;
      public int wWR;
      public int wWS;
      public int wWT;
      public boolean wWU;
      public boolean wWV;
      public boolean wWW;
      public boolean wWX;
      public boolean wWY;
      public boolean wWZ;
      public int wXa;
      public boolean woQ;
      
      public a()
      {
        GMTrace.i(19159714889728L, 142751);
        GMTrace.o(19159714889728L, 142751);
      }
    }
    
    private final class b
    {
      public ImageView hqG;
      public TextView jpZ;
      public NoMeasuredTextView wXc;
      public ImageView wXd;
      public NoMeasuredTextView woT;
      public NoMeasuredTextView woU;
      public NoMeasuredTextView woV;
      public ImageView woW;
      public ImageView woX;
      public View woY;
      
      public b()
      {
        GMTrace.i(19155554140160L, 142720);
        GMTrace.o(19155554140160L, 142720);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\conversation\SettingCheckUnProcessWalletConvUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */