public enum Segment {
    STANDARD {
        @Override
        public String toString() {
            return "Standard";
        }
    },
    MEDIUM {
        @Override
        public String toString() {
            return "Medium";
        }
    },
    PREMIUM {
        @Override
        public String toString() {
            return "Premium";
        }
    }
}
