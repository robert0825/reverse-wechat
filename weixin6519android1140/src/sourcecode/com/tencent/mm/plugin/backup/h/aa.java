package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class aa
  extends com.tencent.mm.bm.a
{
  public String jha;
  public long jil;
  public long jim;
  public String jin;
  
  public aa()
  {
    GMTrace.i(14834682822656L, 110527);
    GMTrace.o(14834682822656L, 110527);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14834817040384L, 110528);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jha == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.jin == null) {
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (this.jha != null) {
        paramVarArgs.e(1, this.jha);
      }
      paramVarArgs.T(2, this.jil);
      paramVarArgs.T(3, this.jim);
      if (this.jin != null) {
        paramVarArgs.e(4, this.jin);
      }
      GMTrace.o(14834817040384L, 110528);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jha == null) {
        break label460;
      }
    }
    label460:
    for (paramInt = b.a.a.b.b.a.f(1, this.jha) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.S(2, this.jil) + b.a.a.a.S(3, this.jim);
      paramInt = i;
      if (this.jin != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jin);
      }
      GMTrace.o(14834817040384L, 110528);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.jha == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        if (this.jin == null) {
          throw new b("Not all required fields were included: MsgDataID");
        }
        GMTrace.o(14834817040384L, 110528);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aa localaa = (aa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14834817040384L, 110528);
          return -1;
        case 1: 
          localaa.jha = locala.yqV.readString();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        case 2: 
          localaa.jil = locala.yqV.nk();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        case 3: 
          localaa.jim = locala.yqV.nk();
          GMTrace.o(14834817040384L, 110528);
          return 0;
        }
        localaa.jin = locala.yqV.readString();
        GMTrace.o(14834817040384L, 110528);
        return 0;
      }
      GMTrace.o(14834817040384L, 110528);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */