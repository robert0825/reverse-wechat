package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.e.i;

public final class e
  extends i<s>
{
  public static final String[] fTX;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(6914092040192L, 51514);
    fTX = new String[] { i.a(s.fTp, "WalletFunciontList") };
    GMTrace.o(6914092040192L, 51514);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, s.fTp, "WalletFunciontList", null);
    GMTrace.i(6913823604736L, 51512);
    this.fTZ = parame;
    GMTrace.o(6913823604736L, 51512);
  }
  
  public final void b(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(6913957822464L, 51513);
    s locals = new s();
    locals.field_wallet_region = paramInt;
    locals.field_function_list = paramString1;
    locals.field_new_list = paramString2;
    locals.field_banner_list = paramString3;
    locals.field_type_name_list = paramString4;
    super.a(locals);
    GMTrace.o(6913957822464L, 51513);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */