package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class sg
  extends com.tencent.mm.bm.a
{
  public String uih;
  
  public sg()
  {
    GMTrace.i(3739708555264L, 27863);
    GMTrace.o(3739708555264L, 27863);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3739842772992L, 27864);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uih == null) {
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (this.uih != null) {
        paramVarArgs.e(1, this.uih);
      }
      GMTrace.o(3739842772992L, 27864);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uih == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = b.a.a.b.b.a.f(1, this.uih) + 0;; paramInt = 0)
    {
      GMTrace.o(3739842772992L, 27864);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uih == null) {
          throw new b("Not all required fields were included: LoginUrl");
        }
        GMTrace.o(3739842772992L, 27864);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        sg localsg = (sg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3739842772992L, 27864);
          return -1;
        }
        localsg.uih = locala.yqV.readString();
        GMTrace.o(3739842772992L, 27864);
        return 0;
      }
      GMTrace.o(3739842772992L, 27864);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */