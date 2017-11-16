package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.e.c;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

public class b
  extends a
{
  public b()
  {
    GMTrace.i(6830877048832L, 50894);
    GMTrace.o(6830877048832L, 50894);
  }
  
  public com.tencent.mm.wallet_core.b a(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831011266560L, 50895);
    w(new Object[] { "start", paramActivity, paramBundle });
    w.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      p.eP(6, paramBundle.getInt("key_bind_scene"));
      com.tencent.mm.wallet_core.c.o.EL(paramBundle.getInt("key_bind_scene"));
    }
    while (n.byx().byS())
    {
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      GMTrace.o(6831011266560L, 50895);
      return this;
      p.eP(6, 0);
      com.tencent.mm.wallet_core.c.o.EL(0);
    }
    if (paramBundle != null) {
      c.dy(paramBundle.getInt("key_bind_scene", 0), 1);
    }
    if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
    {
      c(paramActivity, WalletCardImportUI.class, paramBundle);
      GMTrace.o(6831011266560L, 50895);
      return this;
    }
    paramActivity = super.a(paramActivity, paramBundle);
    GMTrace.o(6831011266560L, 50895);
    return paramActivity;
  }
  
  public d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(6831279702016L, 50897);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6826313646080L, 50860);
          GMTrace.o(6826313646080L, 50860);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6826447863808L, 50861);
          GMTrace.o(6826447863808L, 50861);
          return false;
        }
        
        public final CharSequence se(int paramAnonymousInt)
        {
          GMTrace.i(6826582081536L, 50862);
          switch (paramAnonymousInt)
          {
          default: 
            localObject = super.se(paramAnonymousInt);
            GMTrace.o(6826582081536L, 50862);
            return (CharSequence)localObject;
          case 1: 
            localObject = this.xDN.getString(a.i.tbU);
            GMTrace.o(6826582081536L, 50862);
            return (CharSequence)localObject;
          }
          Object localObject = this.xDN.getString(a.i.tba);
          GMTrace.o(6826582081536L, 50862);
          return (CharSequence)localObject;
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if (((paramMMActivity instanceof WalletCardElementUI)) || ((paramMMActivity instanceof WalletCardImportUI)))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6826850516992L, 50864);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.a.a))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet_core.b.a.a)paramAnonymousk;
              b.a(b.this).putString("kreq_token", paramAnonymousString.token);
              if (b.this.c(this.xDN, b.b(b.this)))
              {
                w.i("MicroMsg.BindCardProcess", "need update bankcardlist");
                this.xDO.a(new com.tencent.mm.plugin.wallet_core.c.o(null), false);
              }
              for (;;)
              {
                GMTrace.o(6826850516992L, 50864);
                return true;
                w.i("MicroMsg.BindCardProcess", "not need update bankcardlist");
                b.this.a(this.xDN, 0, b.c(b.this));
              }
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.c.o))
            {
              w.i("MicroMsg.BindCardProcess", "update bankcardlist success!");
              b.this.a(this.xDN, 0, b.d(b.this));
              GMTrace.o(6826850516992L, 50864);
              return true;
            }
          }
          GMTrace.o(6826850516992L, 50864);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          int i = 2;
          GMTrace.i(6826984734720L, 50865);
          b.this.w(new Object[] { "onNext", paramAnonymousVarArgs });
          w.i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
          paramAnonymousVarArgs = (Authen)paramAnonymousVarArgs[0];
          if (!b.this.clA()) {
            if (!n.byx().byS()) {}
          }
          for (;;)
          {
            paramAnonymousVarArgs.eQl = i;
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.a(paramAnonymousVarArgs), true, 1);
            GMTrace.o(6826984734720L, 50865);
            return true;
            i = 1;
            continue;
            if (n.byx().byS()) {
              i = 5;
            } else {
              i = 4;
            }
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6827253170176L, 50867);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.a.a))
            {
              w.i("MicroMsg.BindCardProcess", "verify code success!");
              paramAnonymousString = (com.tencent.mm.plugin.wallet_core.b.a.a)paramAnonymousk;
              b.e(b.this).putString("kreq_token", paramAnonymousString.token);
              GMTrace.o(6827253170176L, 50867);
              return true;
            }
            if (!(paramAnonymousk instanceof i)) {
              break label123;
            }
            b.this.a(this.xDO);
            if (((i)paramAnonymousk).rcj != null) {
              b.f(b.this).putParcelable("key_bindcard_value_result", ((i)paramAnonymousk).rcj);
            }
          }
          label123:
          while (!(paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.h))
          {
            GMTrace.o(6827253170176L, 50867);
            return false;
          }
          GMTrace.o(6827253170176L, 50867);
          return true;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6827387387904L, 50868);
          b.this.w(new Object[] { "WalletVerifyCodeUI onNext", paramAnonymousVarArgs });
          w.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[1];
          if (n.byx().byS())
          {
            paramAnonymousVarArgs.flag = "2";
            if (!"realname_verify_process".equals(b.this.aAd())) {
              break label121;
            }
            this.xDO.a(new i(paramAnonymousVarArgs, b.this.ler.getInt("entry_scene", -1)), true, 1);
          }
          for (;;)
          {
            GMTrace.o(6827387387904L, 50868);
            return true;
            paramAnonymousVarArgs.flag = "1";
            break;
            label121:
            this.xDO.a(new i(paramAnonymousVarArgs), true, 1);
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(6828863782912L, 50879);
          if ((paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.b.a.b))
          {
            b.this.a(this.xDO);
            if (((com.tencent.mm.plugin.wallet_core.b.a.b)paramAnonymousk).rcj != null) {
              b.g(b.this).putParcelable("key_bindcard_value_result", ((com.tencent.mm.plugin.wallet_core.b.a.b)paramAnonymousk).rcj);
            }
          }
          while (!(paramAnonymousk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.h))
          {
            GMTrace.o(6828863782912L, 50879);
            return false;
          }
          GMTrace.o(6828863782912L, 50879);
          return true;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6828998000640L, 50880);
          paramAnonymousVarArgs = (com.tencent.mm.plugin.wallet_core.model.o)paramAnonymousVarArgs[0];
          b.h(b.this).getString("verify_card_flag", "0");
          if ("realname_verify_process".equals(b.this.aAd())) {
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramAnonymousVarArgs, b.this.ler.getInt("entry_scene", -1)), true);
          }
          for (;;)
          {
            GMTrace.o(6828998000640L, 50880);
            return false;
            this.xDO.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramAnonymousVarArgs), true);
          }
        }
      };
      GMTrace.o(6831279702016L, 50897);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6831279702016L, 50897);
    return paramMMActivity;
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(6831145484288L, 50896);
    w(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    w.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      if (paramBundle.getBoolean("key_is_import_bind", false))
      {
        c(paramActivity, WalletCardImportUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if (((paramActivity instanceof WalletCardElementUI)) || ((paramActivity instanceof WalletCardImportUI)))
    {
      if (!clA())
      {
        w.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      if (!n.byx().byS())
      {
        w.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      w.i("MicroMsg.BindCardProcess", "bind bank card success!!");
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bm(paramActivity, paramActivity.getString(a.i.sZL));
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    BindCardOrder localBindCardOrder;
    String str1;
    String str2;
    String str3;
    int i;
    if (((paramActivity instanceof WalletVerifyCodeUI)) && (n.byx().byS()))
    {
      w.i("MicroMsg.BindCardProcess", "end process after verify!");
      paramInt = this.ler.getInt("key_bind_scene", -1);
      localBindCardOrder = (BindCardOrder)this.ler.getParcelable("key_bindcard_value_result");
      if ((localBindCardOrder != null) && (paramInt == 15))
      {
        str1 = this.ler.getString("key_bind_card_type");
        str2 = this.ler.getString("key_bind_card_show1");
        str3 = this.ler.getString("key_bind_card_show2");
        paramInt = this.ler.getInt("key_bind_scene");
        i = this.ler.getInt("realname_scene");
        w.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i) });
        localBindCardOrder.nDt = str1;
        localBindCardOrder.yvr = str2;
        localBindCardOrder.yvs = str3;
        localBindCardOrder.rfo = paramInt;
        localBindCardOrder.rfp = i;
        c(paramActivity, WalletBindCardResultUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      w.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
      c.dy(this.ler.getInt("key_bind_scene", 0), 7);
      paramBundle.putBoolean("intent_bind_end", true);
      com.tencent.mm.ui.base.h.bm(paramActivity, paramActivity.getString(a.i.sZL));
      localBindCardOrder = (BindCardOrder)this.ler.getParcelable("key_bindcard_value_result");
      paramInt = this.ler.getInt("key_bind_scene", -1);
      if ((localBindCardOrder != null) && (paramInt == 15))
      {
        str1 = this.ler.getString("key_bind_card_type");
        str2 = this.ler.getString("key_bind_card_show1");
        str3 = this.ler.getString("key_bind_card_show2");
        paramInt = this.ler.getInt("key_bind_scene");
        i = this.ler.getInt("realname_scene");
        w.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i) });
        localBindCardOrder.nDt = str1;
        localBindCardOrder.yvr = str2;
        localBindCardOrder.yvs = str3;
        localBindCardOrder.rfo = paramInt;
        localBindCardOrder.rfp = i;
        c(paramActivity, WalletBindCardResultUI.class, paramBundle);
        GMTrace.o(6831145484288L, 50896);
        return;
      }
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    if ((paramActivity instanceof WalletBindCardResultUI))
    {
      b(paramActivity, paramBundle);
      GMTrace.o(6831145484288L, 50896);
      return;
    }
    w.i("MicroMsg.BindCardProcess", "super forward!");
    super.a(paramActivity, 0, paramBundle);
    GMTrace.o(6831145484288L, 50896);
  }
  
  public final void a(f paramf)
  {
    GMTrace.i(6831413919744L, 50898);
    w.d("MicroMsg.BindCardProcess", "do set user exinfo");
    paramf.a(new com.tencent.mm.plugin.wallet_core.id_verify.model.h(this.ler.getString("key_country_code", ""), this.ler.getString("key_province_code", ""), this.ler.getString("key_city_code", ""), (Profession)this.ler.getParcelable("key_profession")), false, 1);
    GMTrace.o(6831413919744L, 50898);
  }
  
  public String aAd()
  {
    GMTrace.i(6831816572928L, 50901);
    GMTrace.o(6831816572928L, 50901);
    return "BindCardProcess";
  }
  
  public void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831548137472L, 50899);
    w(new Object[] { "end", paramActivity, paramBundle });
    w.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
    com.tencent.mm.wallet_core.c.o.clP();
    clE();
    if ((paramBundle != null) && (paramBundle.getBoolean("key_need_bind_response", false)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      a(paramActivity, "wallet", ".bind.ui.WalletBindUI", -1, localIntent, false);
      GMTrace.o(6831548137472L, 50899);
      return;
    }
    d(paramActivity, "mall", ".ui.MallIndexUI");
    GMTrace.o(6831548137472L, 50899);
  }
  
  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6831682355200L, 50900);
    if (n.byx().byS())
    {
      if (((paramActivity instanceof WalletCardElementUI)) && (clA()))
      {
        GMTrace.o(6831682355200L, 50900);
        return true;
      }
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        GMTrace.o(6831682355200L, 50900);
        return true;
      }
      GMTrace.o(6831682355200L, 50900);
      return false;
    }
    boolean bool = paramActivity instanceof WalletPwdConfirmUI;
    GMTrace.o(6831682355200L, 50900);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */