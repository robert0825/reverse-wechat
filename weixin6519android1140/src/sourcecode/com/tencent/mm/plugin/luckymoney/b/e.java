package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bm.a
{
  public long eYB;
  public int eYn;
  public int eYo;
  public int jWn;
  public String mFr;
  public int mFw;
  public String mFx;
  public String mFy;
  public String mFz;
  public String mIA;
  public String mIB;
  public int mIb;
  public String mIc;
  public String mIe;
  public String mIf;
  public String mIg;
  public String mIh;
  public String mIi;
  public String mIj;
  public long mIk;
  public long mIl;
  public long mIm;
  public String mIn;
  public int mIo;
  public int mIp;
  public int mIq;
  public String mIr;
  public int mIs;
  public a mIt;
  public LinkedList<ag> mIu;
  public ag mIv;
  public String mIw;
  public String mIx;
  public int mIy;
  public LinkedList<m> mIz;
  public int resourceId;
  
  public e()
  {
    GMTrace.i(9742730657792L, 72589);
    this.mIu = new LinkedList();
    this.mIz = new LinkedList();
    GMTrace.o(9742730657792L, 72589);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9742864875520L, 72590);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.mIb);
      paramVarArgs.fk(2, this.eYn);
      if (this.mIc != null) {
        paramVarArgs.e(3, this.mIc);
      }
      if (this.mIe != null) {
        paramVarArgs.e(4, this.mIe);
      }
      if (this.mIf != null) {
        paramVarArgs.e(5, this.mIf);
      }
      if (this.mIg != null) {
        paramVarArgs.e(6, this.mIg);
      }
      if (this.mIh != null) {
        paramVarArgs.e(7, this.mIh);
      }
      if (this.mFr != null) {
        paramVarArgs.e(8, this.mFr);
      }
      if (this.mIi != null) {
        paramVarArgs.e(9, this.mIi);
      }
      if (this.mIj != null) {
        paramVarArgs.e(10, this.mIj);
      }
      paramVarArgs.T(11, this.eYB);
      paramVarArgs.T(12, this.mIk);
      paramVarArgs.T(13, this.mIl);
      paramVarArgs.fk(14, this.jWn);
      paramVarArgs.T(15, this.mIm);
      if (this.mIn != null) {
        paramVarArgs.e(16, this.mIn);
      }
      paramVarArgs.fk(17, this.mIo);
      paramVarArgs.fk(18, this.mIp);
      paramVarArgs.fk(19, this.mIq);
      if (this.mIr != null) {
        paramVarArgs.e(20, this.mIr);
      }
      paramVarArgs.fk(21, this.eYo);
      paramVarArgs.fk(22, this.mIs);
      if (this.mIt != null)
      {
        paramVarArgs.fm(23, this.mIt.aYq());
        this.mIt.a(paramVarArgs);
      }
      paramVarArgs.fk(24, this.mFw);
      if (this.mFy != null) {
        paramVarArgs.e(25, this.mFy);
      }
      paramVarArgs.d(26, 8, this.mIu);
      if (this.mIv != null)
      {
        paramVarArgs.fm(27, this.mIv.aYq());
        this.mIv.a(paramVarArgs);
      }
      if (this.mIw != null) {
        paramVarArgs.e(28, this.mIw);
      }
      if (this.mIx != null) {
        paramVarArgs.e(29, this.mIx);
      }
      paramVarArgs.fk(30, this.mIy);
      paramVarArgs.fk(31, this.resourceId);
      if (this.mFz != null) {
        paramVarArgs.e(32, this.mFz);
      }
      paramVarArgs.d(33, 8, this.mIz);
      if (this.mFx != null) {
        paramVarArgs.e(34, this.mFx);
      }
      if (this.mIA != null) {
        paramVarArgs.e(35, this.mIA);
      }
      if (this.mIB != null) {
        paramVarArgs.e(36, this.mIB);
      }
      GMTrace.o(9742864875520L, 72590);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.mIb) + 0 + b.a.a.a.fh(2, this.eYn);
      paramInt = i;
      if (this.mIc != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.mIc);
      }
      i = paramInt;
      if (this.mIe != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mIe);
      }
      paramInt = i;
      if (this.mIf != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.mIf);
      }
      i = paramInt;
      if (this.mIg != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.mIg);
      }
      paramInt = i;
      if (this.mIh != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.mIh);
      }
      i = paramInt;
      if (this.mFr != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.mFr);
      }
      paramInt = i;
      if (this.mIi != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.mIi);
      }
      i = paramInt;
      if (this.mIj != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.mIj);
      }
      i = i + b.a.a.a.S(11, this.eYB) + b.a.a.a.S(12, this.mIk) + b.a.a.a.S(13, this.mIl) + b.a.a.a.fh(14, this.jWn) + b.a.a.a.S(15, this.mIm);
      paramInt = i;
      if (this.mIn != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.mIn);
      }
      i = paramInt + b.a.a.a.fh(17, this.mIo) + b.a.a.a.fh(18, this.mIp) + b.a.a.a.fh(19, this.mIq);
      paramInt = i;
      if (this.mIr != null) {
        paramInt = i + b.a.a.b.b.a.f(20, this.mIr);
      }
      i = paramInt + b.a.a.a.fh(21, this.eYo) + b.a.a.a.fh(22, this.mIs);
      paramInt = i;
      if (this.mIt != null) {
        paramInt = i + b.a.a.a.fj(23, this.mIt.aYq());
      }
      i = paramInt + b.a.a.a.fh(24, this.mFw);
      paramInt = i;
      if (this.mFy != null) {
        paramInt = i + b.a.a.b.b.a.f(25, this.mFy);
      }
      i = paramInt + b.a.a.a.c(26, 8, this.mIu);
      paramInt = i;
      if (this.mIv != null) {
        paramInt = i + b.a.a.a.fj(27, this.mIv.aYq());
      }
      i = paramInt;
      if (this.mIw != null) {
        i = paramInt + b.a.a.b.b.a.f(28, this.mIw);
      }
      paramInt = i;
      if (this.mIx != null) {
        paramInt = i + b.a.a.b.b.a.f(29, this.mIx);
      }
      i = paramInt + b.a.a.a.fh(30, this.mIy) + b.a.a.a.fh(31, this.resourceId);
      paramInt = i;
      if (this.mFz != null) {
        paramInt = i + b.a.a.b.b.a.f(32, this.mFz);
      }
      i = paramInt + b.a.a.a.c(33, 8, this.mIz);
      paramInt = i;
      if (this.mFx != null) {
        paramInt = i + b.a.a.b.b.a.f(34, this.mFx);
      }
      i = paramInt;
      if (this.mIA != null) {
        i = paramInt + b.a.a.b.b.a.f(35, this.mIA);
      }
      paramInt = i;
      if (this.mIB != null) {
        paramInt = i + b.a.a.b.b.a.f(36, this.mIB);
      }
      GMTrace.o(9742864875520L, 72590);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mIu.clear();
      this.mIz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(9742864875520L, 72590);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(9742864875520L, 72590);
        return -1;
      case 1: 
        locale.mIb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 2: 
        locale.eYn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 3: 
        locale.mIc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 4: 
        locale.mIe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 5: 
        locale.mIf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 6: 
        locale.mIg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 7: 
        locale.mIh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 8: 
        locale.mFr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 9: 
        locale.mIi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 10: 
        locale.mIj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 11: 
        locale.eYB = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 12: 
        locale.mIk = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 13: 
        locale.mIl = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 14: 
        locale.jWn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 15: 
        locale.mIm = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 16: 
        locale.mIn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 17: 
        locale.mIo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 18: 
        locale.mIp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 19: 
        locale.mIq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 20: 
        locale.mIr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 21: 
        locale.eYo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 22: 
        locale.mIs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 23: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.mIt = ((a)localObject1);
          paramInt += 1;
        }
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 24: 
        locale.mFw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 25: 
        locale.mFy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 26: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ag();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ag)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.mIu.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 27: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ag();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ag)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.mIv = ((ag)localObject1);
          paramInt += 1;
        }
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 28: 
        locale.mIw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 29: 
        locale.mIx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 30: 
        locale.mIy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 31: 
        locale.resourceId = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 32: 
        locale.mFz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 33: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.mIz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 34: 
        locale.mFx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      case 35: 
        locale.mIA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(9742864875520L, 72590);
        return 0;
      }
      locale.mIB = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(9742864875520L, 72590);
      return 0;
    }
    GMTrace.o(9742864875520L, 72590);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */