package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class om
  extends ayx
{
  public int jhc;
  public String lPi;
  public String ufq;
  public String ufr;
  public alk ufs;
  public LinkedList<azq> uft;
  public String ufu;
  public String ufv;
  
  public om()
  {
    GMTrace.i(3664143974400L, 27300);
    this.uft = new LinkedList();
    GMTrace.o(3664143974400L, 27300);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3664278192128L, 27301);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lPi != null) {
        paramVarArgs.e(2, this.lPi);
      }
      if (this.ufq != null) {
        paramVarArgs.e(3, this.ufq);
      }
      if (this.ufr != null) {
        paramVarArgs.e(4, this.ufr);
      }
      if (this.ufs != null)
      {
        paramVarArgs.fm(5, this.ufs.aYq());
        this.ufs.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.jhc);
      paramVarArgs.d(7, 8, this.uft);
      if (this.ufu != null) {
        paramVarArgs.e(8, this.ufu);
      }
      if (this.ufv != null) {
        paramVarArgs.e(9, this.ufv);
      }
      GMTrace.o(3664278192128L, 27301);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPi);
      }
      i = paramInt;
      if (this.ufq != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ufq);
      }
      paramInt = i;
      if (this.ufr != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ufr);
      }
      i = paramInt;
      if (this.ufs != null) {
        i = paramInt + b.a.a.a.fj(5, this.ufs.aYq());
      }
      i = i + b.a.a.a.fh(6, this.jhc) + b.a.a.a.c(7, 8, this.uft);
      paramInt = i;
      if (this.ufu != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ufu);
      }
      i = paramInt;
      if (this.ufv != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ufv);
      }
      GMTrace.o(3664278192128L, 27301);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uft.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufs == null) {
        throw new b("Not all required fields were included: Loc");
      }
      GMTrace.o(3664278192128L, 27301);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      om localom = (om)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3664278192128L, 27301);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localom.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 2: 
        localom.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 3: 
        localom.ufq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 4: 
        localom.ufr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localom.ufs = ((alk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 6: 
        localom.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localom.uft.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3664278192128L, 27301);
        return 0;
      case 8: 
        localom.ufu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3664278192128L, 27301);
        return 0;
      }
      localom.ufv = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3664278192128L, 27301);
      return 0;
    }
    GMTrace.o(3664278192128L, 27301);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */