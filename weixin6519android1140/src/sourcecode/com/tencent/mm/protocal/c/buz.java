package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class buz
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tVL;
  public LinkedList<buw> tVM;
  public String vdq;
  
  public buz()
  {
    GMTrace.i(15348334067712L, 114354);
    this.tVM = new LinkedList();
    GMTrace.o(15348334067712L, 114354);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15348468285440L, 114355);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vdq == null) {
        throw new b.a.a.b("Not all required fields were included: WxaUserName");
      }
      if (this.vdq != null) {
        paramVarArgs.e(1, this.vdq);
      }
      if (this.tVL != null) {
        paramVarArgs.b(2, this.tVL);
      }
      paramVarArgs.d(3, 8, this.tVM);
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.vdq != null) {
        paramInt = b.a.a.b.b.a.f(1, this.vdq) + 0;
      }
      i = paramInt;
      if (this.tVL != null) {
        i = paramInt + b.a.a.a.a(2, this.tVL);
      }
      paramInt = b.a.a.a.c(3, 8, this.tVM);
      GMTrace.o(15348468285440L, 114355);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tVM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vdq == null) {
        throw new b.a.a.b("Not all required fields were included: WxaUserName");
      }
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buz localbuz = (buz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15348468285440L, 114355);
        return -1;
      case 1: 
        localbuz.vdq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15348468285440L, 114355);
        return 0;
      case 2: 
        localbuz.tVL = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(15348468285440L, 114355);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new buw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((buw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbuz.tVM.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(15348468285440L, 114355);
      return 0;
    }
    GMTrace.o(15348468285440L, 114355);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */