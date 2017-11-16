package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bav
  extends com.tencent.mm.bm.a
{
  public long tXu;
  public all uBS;
  public int uOj;
  public LinkedList<bms> uOk;
  public String uqq;
  
  public bav()
  {
    GMTrace.i(3616899334144L, 26948);
    this.uOk = new LinkedList();
    GMTrace.o(3616899334144L, 26948);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3617033551872L, 26949);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uqq == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      paramVarArgs.T(1, this.tXu);
      if (this.uqq != null) {
        paramVarArgs.e(2, this.uqq);
      }
      if (this.uBS != null)
      {
        paramVarArgs.fm(3, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.uOj);
      paramVarArgs.d(5, 8, this.uOk);
      GMTrace.o(3617033551872L, 26949);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.tXu) + 0;
      paramInt = i;
      if (this.uqq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uqq);
      }
      i = paramInt;
      if (this.uBS != null) {
        i = paramInt + b.a.a.a.fj(3, this.uBS.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.uOj);
      int j = b.a.a.a.c(5, 8, this.uOk);
      GMTrace.o(3617033551872L, 26949);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uOk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uqq == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      GMTrace.o(3617033551872L, 26949);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bav localbav = (bav)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3617033551872L, 26949);
        return -1;
      case 1: 
        localbav.tXu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3617033551872L, 26949);
        return 0;
      case 2: 
        localbav.uqq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3617033551872L, 26949);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbav.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3617033551872L, 26949);
        return 0;
      case 4: 
        localbav.uOj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3617033551872L, 26949);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bms();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bms)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbav.uOk.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3617033551872L, 26949);
      return 0;
    }
    GMTrace.o(3617033551872L, 26949);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */