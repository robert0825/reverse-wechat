package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bal
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int tWu;
  public long tXu;
  public String tXx;
  public all uBS;
  public int uOj;
  public LinkedList<bms> uOk;
  public String uqq;
  
  public bal()
  {
    GMTrace.i(3973113184256L, 29602);
    this.uOk = new LinkedList();
    GMTrace.o(3973113184256L, 29602);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3973247401984L, 29603);
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
      paramVarArgs.fk(3, this.tWu);
      if (this.uBS != null)
      {
        paramVarArgs.fm(4, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.uOj);
      paramVarArgs.d(6, 8, this.uOk);
      paramVarArgs.fk(7, this.tOG);
      if (this.tXx != null) {
        paramVarArgs.e(8, this.tXx);
      }
      GMTrace.o(3973247401984L, 29603);
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
      i = paramInt + b.a.a.a.fh(3, this.tWu);
      paramInt = i;
      if (this.uBS != null) {
        paramInt = i + b.a.a.a.fj(4, this.uBS.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.uOj) + b.a.a.a.c(6, 8, this.uOk) + b.a.a.a.fh(7, this.tOG);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tXx);
      }
      GMTrace.o(3973247401984L, 29603);
      return paramInt;
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
      GMTrace.o(3973247401984L, 29603);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bal localbal = (bal)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3973247401984L, 29603);
        return -1;
      case 1: 
        localbal.tXu = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 2: 
        localbal.uqq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 3: 
        localbal.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbal.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 5: 
        localbal.uOj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bms();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bms)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbal.uOk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3973247401984L, 29603);
        return 0;
      case 7: 
        localbal.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3973247401984L, 29603);
        return 0;
      }
      localbal.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3973247401984L, 29603);
      return 0;
    }
    GMTrace.o(3973247401984L, 29603);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */