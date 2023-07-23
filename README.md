# LookAndSay

### 해결 과정
처음엔 객체를 통한 관리를 생각했습니다.
``` Java
private static class NumObj {
        private byte target;
        private byte count;
        public NumObj(int target, int count) {
            this.target = (byte) target;
            this.count = (byte) count;
        }
    }
```
