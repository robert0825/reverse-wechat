package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;

public final class m
  extends com.tencent.mm.bm.a
{
  public int id;
  public String name;
  public String url;
  
  public m()
  {
    GMTrace.i(7696312958976L, 57342);
    GMTrace.o(7696312958976L, 57342);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7696447176704L, 57343);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.id);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      GMTrace.o(7696447176704L, 57343);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.id) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      GMTrace.o(7696447176704L, 57343);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(7696447176704L, 57343);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      m localm = (m)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(7696447176704L, 57343);
        return -1;
      case 1: 
        localm.id = locala.yqV.nj();
        GMTrace.o(7696447176704L, 57343);
        return 0;
      case 2: 
        localm.name = locala.yqV.readString();
        GMTrace.o(7696447176704L, 57343);
        return 0;
      }
      localm.url = locala.yqV.readString();
      GMTrace.o(7696447176704L, 57343);
      return 0;
    }
    GMTrace.o(7696447176704L, 57343);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */