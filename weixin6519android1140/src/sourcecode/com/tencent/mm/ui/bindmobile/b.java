package com.tencent.mm.ui.bindmobile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class b
  extends a
{
  private int[] gCW;
  private String htQ;
  private a.a wnM;
  private a.b wnN;
  
  public b(Context paramContext, o.a parama)
  {
    super(paramContext, new com.tencent.mm.modelfriend.b());
    GMTrace.i(3115461902336L, 23212);
    this.wnN = new a.b()
    {
      public final void e(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(3109824757760L, 23170);
        w.d("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString, Integer.valueOf(paramAnonymousInt2) });
        final com.tencent.mm.modelfriend.b localb = (com.tencent.mm.modelfriend.b)b.this.getItem(paramAnonymousInt1);
        if (localb == null)
        {
          w.e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", new Object[] { paramAnonymousString });
          GMTrace.o(3109824757760L, 23170);
          return;
        }
        w.d("MicroMsg.MobileFriendAdapter", "mobile friend:%s", new Object[] { localb.toString() });
        if (localb.status == 1)
        {
          paramAnonymousString = new com.tencent.mm.pluginsdk.ui.applet.a(b.a(b.this), new com.tencent.mm.pluginsdk.ui.applet.a.a()
          {
            public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
            {
              GMTrace.i(3128481021952L, 23309);
              w.i("MicroMsg.MobileFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2), paramAnonymous2String1, paramAnonymous2String2 });
              com.tencent.mm.modelfriend.b localb = af.If().jK(paramAnonymous2String2);
              if (localb != null)
              {
                if (paramAnonymous2Boolean1)
                {
                  localb.username = paramAnonymous2String1;
                  localb.status = 2;
                  localb.gsR = 2;
                  w.d("MicroMsg.MobileFriendAdapter", "f :%s", new Object[] { localb.toString() });
                  af.If().a(paramAnonymous2String2, localb);
                  b.this.QF();
                  bq.BG().c(26, new Object[0]);
                  GMTrace.o(3128481021952L, 23309);
                }
              }
              else {
                w.w("MicroMsg.MobileFriendAdapter", "cpan qq friend is null. qq:%s", new Object[] { paramAnonymous2String2 });
              }
              GMTrace.o(3128481021952L, 23309);
            }
          });
          paramAnonymousString.twn = new com.tencent.mm.pluginsdk.ui.applet.a.b()
          {
            public final boolean aJw()
            {
              GMTrace.i(3102711218176L, 23117);
              Intent localIntent = new Intent();
              localIntent.putExtra("Contact_User", localb.getUsername());
              localIntent.putExtra("Contact_Nick", localb.GX());
              localIntent.putExtra("Contact_Scene", 13);
              localIntent.putExtra("sayhi_with_sns_perm_send_verify", true);
              localIntent.putExtra("sayhi_with_sns_perm_add_remark", true);
              localIntent.putExtra("sayhi_with_jump_to_profile", true);
              d.b(b.b(b.this), "profile", ".ui.SayHiWithSnsPermissionUI", localIntent, 1);
              GMTrace.o(3102711218176L, 23117);
              return true;
            }
          };
          if ((b.c(b.this) instanceof MobileFriendUI)) {
            ((MobileFriendUI)b.e(b.this)).vKC = new MMActivity.a()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, Intent paramAnonymous2Intent)
              {
                GMTrace.i(3106871967744L, 23148);
                if ((paramAnonymous2Int1 == 1) && (paramAnonymous2Int2 == -1)) {
                  ((MobileFriendUI)b.d(b.this)).b(localb);
                }
                GMTrace.o(3106871967744L, 23148);
              }
            };
          }
          paramAnonymousString.twv = localb.GS();
          paramAnonymousString.twu = false;
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(13));
          paramAnonymousString.b(localb.getUsername(), localLinkedList, false);
        }
        GMTrace.o(3109824757760L, 23170);
      }
    };
    this.vKu = parama;
    this.context = paramContext;
    GMTrace.o(3115461902336L, 23212);
  }
  
  private static com.tencent.mm.modelfriend.b a(com.tencent.mm.modelfriend.b paramb, Cursor paramCursor)
  {
    GMTrace.i(3116132990976L, 23217);
    com.tencent.mm.modelfriend.b localb = paramb;
    if (paramb == null) {
      localb = new com.tencent.mm.modelfriend.b();
    }
    localb.b(paramCursor);
    GMTrace.o(3116132990976L, 23217);
    return localb;
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(3115596120064L, 23213);
    this.htQ = bg.nk(paramString.trim());
    aJe();
    QF();
    GMTrace.o(3115596120064L, 23213);
  }
  
  public final void QF()
  {
    GMTrace.i(3115864555520L, 23215);
    aJe();
    Object localObject = af.If();
    String str = this.htQ;
    StringBuilder localStringBuilder = new StringBuilder();
    if ((str != null) && (str.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + str + "%' )");
    }
    localStringBuilder.append(" and (");
    localStringBuilder.append("addr_upload2.status=1");
    localStringBuilder.append(" or ");
    localStringBuilder.append("addr_upload2.status=2");
    localStringBuilder.append(")");
    at.AR();
    str = (String)com.tencent.mm.y.c.xh().get(6, null);
    if ((str != null) && (!str.equals(""))) {}
    for (localObject = ((com.tencent.mm.modelfriend.c)localObject).goN.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + str + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null, 0);; localObject = ((com.tencent.mm.modelfriend.c)localObject).goN.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by  case when status = 1 then 0  when status = 65536 then 1  when status = 2 then 2 else 3 end  , realnamepyinitial", null, 0))
    {
      setCursor((Cursor)localObject);
      this.gCW = new int[getCount()];
      if ((this.wnM != null) && (this.htQ != null)) {
        this.wnM.Bs(getCursor().getCount());
      }
      notifyDataSetChanged();
      GMTrace.o(3115864555520L, 23215);
      return;
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(3115730337792L, 23214);
    QF();
    GMTrace.o(3115730337792L, 23214);
  }
  
  public final void a(a.a parama)
  {
    GMTrace.i(3115327684608L, 23211);
    this.wnM = parama;
    GMTrace.o(3115327684608L, 23211);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3115998773248L, 23216);
    com.tencent.mm.modelfriend.b localb = (com.tencent.mm.modelfriend.b)getItem(paramInt);
    View localView;
    if (paramView == null)
    {
      localView = View.inflate(this.context, R.i.cCr, null);
      paramView = new a(localView);
      paramView.gDd = ((TextView)localView.findViewById(R.h.bNI));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      paramViewGroup.vaM = paramInt;
      paramViewGroup.eDW = localb.GS();
      paramViewGroup.status = localb.status;
      paramViewGroup.gDd.setText(localb.GU());
      switch (localb.status)
      {
      default: 
        label136:
        switch (localb.gsR)
        {
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(3115998773248L, 23216);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      if (localb.gsR == 2)
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dyg);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label136;
      }
      paramViewGroup.wnR.setClickable(true);
      paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
      paramViewGroup.hql.setText(R.l.dyf);
      paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.white));
      break label136;
      w.d("MicroMsg.MobileFriendAdapter", "username:%s", new Object[] { localb.getUsername() });
      at.AR();
      if ((com.tencent.mm.y.c.yK().TA(localb.getUsername())) || (q.zE().equals(localb.getUsername())))
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dye);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label136;
      }
      if (localb.gsR == 2)
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dyi);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label136;
      }
      paramViewGroup.wnR.setClickable(true);
      paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
      paramViewGroup.hql.setText(R.l.dyd);
      paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.white));
      break label136;
      paramViewGroup.hql.setVisibility(4);
      paramViewGroup.wnS.setVisibility(0);
      continue;
      paramViewGroup.hql.setVisibility(0);
      paramViewGroup.wnS.setVisibility(4);
    }
  }
  
  final class a
  {
    String eDW;
    TextView gDd;
    TextView hql;
    int status;
    int vaM;
    View wnR;
    ProgressBar wnS;
    
    public a(View paramView)
    {
      GMTrace.i(3110898499584L, 23178);
      this.gDd = ((TextView)paramView.findViewById(R.h.bNI));
      this.wnR = paramView.findViewById(R.h.bNA);
      this.hql = ((TextView)paramView.findViewById(R.h.bNL));
      this.wnS = ((ProgressBar)paramView.findViewById(R.h.bNK));
      this.wnR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3121904353280L, 23260);
          if (b.f(b.this) != null) {
            b.f(b.this).e(b.a.this.vaM, b.a.this.eDW, b.a.this.status);
          }
          GMTrace.o(3121904353280L, 23260);
        }
      });
      GMTrace.o(3110898499584L, 23178);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */